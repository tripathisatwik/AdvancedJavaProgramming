package main;
import javax.swing.SwingUtilities;
import ui.frame.MainFrame;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
        //new MainFrame() - use this code if confused
    }
}
