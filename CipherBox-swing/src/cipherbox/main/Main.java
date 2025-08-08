package cipherbox.main;

import cipherbox.view.LoginPage;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new LoginPage().setVisible(true);
        });
    }
}
