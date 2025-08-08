package cipherbox.dao;

import cipherbox.config.DBConnection;
import cipherbox.utils.PasswordUtil;

import java.sql.*;

public class UserDAO {

    public static boolean register(String username, String password) {
        try (Connection conn = DBConnection.getConnection()) {
            String salt = PasswordUtil.generateSalt();
            String hash = PasswordUtil.hashPassword(password, salt);

            String sql = "INSERT INTO users (username, password_hash, salt) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, hash);
            stmt.setString(3, salt);

            stmt.executeUpdate();
            return true;
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Username already exists.");
        } catch (Exception e) {
            e.printStackTrace(); // this will show us the real error
        }
        return false;
    }

    public static boolean login(String username, String password) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT password_hash, salt FROM users WHERE username = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String storedHash = rs.getString("password_hash");
                String salt = rs.getString("salt");

                String enteredHash = PasswordUtil.hashPassword(password, salt);
                return storedHash.equals(enteredHash);
            }
        } catch (Exception e) {
            System.out.println("Login Error: " + e.getMessage());
        }
        return false;
    }
    
}
