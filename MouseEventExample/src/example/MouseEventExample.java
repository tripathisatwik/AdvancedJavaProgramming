//package example;
//
//import java.awt.Color;
//import java.awt.GridLayout;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import javax.swing.JButton;
//import javax.swing.JTextField;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPasswordField;
//
//public class MouseEventExample extends JFrame implements MouseListener {
//    GridLayout layout;
//    JButton submit, close;
//    JLabel lbl_username, lbl_password;
//    JTextField txt_username;
//    JPasswordField txt_password;
//
//    public MouseEventExample() {
//        // Initialize components
//        close = new JButton("Close");
//        submit = new JButton("Submit");
//
//        txt_username = new JTextField();
//        txt_password = new JPasswordField();
//
//        lbl_username = new JLabel("Enter Username:");
//        lbl_password = new JLabel("Enter Password:");
//
//        // Layout and settings
//        layout = new GridLayout(3, 2, 5, 5);
//        setLayout(layout);
//
//        add(lbl_username);
//        add(txt_username);
//        add(lbl_password);
//        add(txt_password);
//        add(submit);
//        add(close);
//
//        setSize(400, 300);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setVisible(true);
//
//        // Add mouse listeners
//        submit.addMouseListener(this);
//        close.addMouseListener(this);
//    }
//
//    public static void main(String[] args) {
//        new MouseEventExample();
//    }
//
//    @Override
//    public void mouseClicked(MouseEvent e) {
//        if (e.getSource() == submit) {
//            String username = txt_username.getText();
//            String password = new String(txt_password.getPassword());
//            JOptionPane.showMessageDialog(this, "Your username: " + username + "\nPassword: " + password);
//        } else if (e.getSource() == close) {
//            System.exit(0);
//        }
//    }
//
//    @Override
//    public void mousePressed(MouseEvent e) {
//        if (e.getSource() == submit) {
//            submit.setBackground(Color.GREEN);
//        }
//    }
//
//    @Override
//    public void mouseReleased(MouseEvent e) {
//        if (e.getSource() == submit) {
//            submit.setBackground(null);
//        }
//    }
//
//    @Override
//    public void mouseEntered(MouseEvent e) {
//        if (e.getSource() == submit) {
//            submit.setBackground(Color.CYAN);
//        } else if (e.getSource() == close) {
//            close.setBackground(Color.RED);
//        }
//    }
//
//    @Override
//    public void mouseExited(MouseEvent e) {
//        if (e.getSource() == submit || e.getSource() == close) {
//            ((JButton) e.getSource()).setBackground(null);
//        }
//    }
//}
