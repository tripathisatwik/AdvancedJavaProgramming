package cipherbox.view;

import javax.swing.*;

public class Dashboard extends JFrame {
    private String username;

    public Dashboard(String username) {
        this.username = username;
        setTitle("CipherBox - Dashboard (" + username + ")");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel welcomeLabel = new JLabel("Welcome, " + username + "!");
        JButton encryptBtn = new JButton("Encrypt File");
        JButton decryptBtn = new JButton("Decrypt File");
        JButton logoutBtn = new JButton("Logout");

        panel.add(welcomeLabel);
        panel.add(encryptBtn);
        panel.add(decryptBtn);
        panel.add(logoutBtn);

        add(panel);

        logoutBtn.addActionListener(e -> {
            new LoginPage().setVisible(true);
            dispose();
        });

        // Placeholder actions for now
        encryptBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Encrypt screen coming soon!");
        });

        decryptBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Decrypt screen coming soon!");
        });
    }
}
