package cipherbox.view;

import cipherbox.dao.UserDAO;

import javax.swing.*;

public class RegisterPage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public RegisterPage() {
        setTitle("CipherBox - Register");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);
        JButton registerBtn = new JButton("Register");
        JButton backBtn = new JButton("Back");

        panel.add(new JLabel("New Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(registerBtn);
        panel.add(backBtn);

        add(panel);

        registerBtn.addActionListener(e -> {
            String user = usernameField.getText();
            String pass = new String(passwordField.getPassword());

            if (UserDAO.register(user, pass)) {
                JOptionPane.showMessageDialog(this, "Registration Successful! Please login.");
                new LoginPage().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "User already exists or error occurred.");
            }
        });

        backBtn.addActionListener(e -> {
            new LoginPage().setVisible(true);
            dispose();
        });
    }
}
