package cipherbox.view;
import cipherbox.dao.UserDAO;
import javax.swing.*;
import java.awt.event.*;

public class LoginPage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginPage() {
        setTitle("CipherBox - Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);
        JButton loginBtn = new JButton("Login");
        JButton registerBtn = new JButton("Register");

        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(loginBtn);
        panel.add(registerBtn);

        add(panel);

        loginBtn.addActionListener(e -> {
            String user = usernameField.getText();
            String pass = new String(passwordField.getPassword());

            if (UserDAO.login(user, pass)) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
                new Dashboard(user).setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials");
            }
        });

        registerBtn.addActionListener(e -> {
            new RegisterPage().setVisible(true);
            dispose();
        });
    }
}
