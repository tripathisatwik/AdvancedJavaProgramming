package ui.frame;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class AddUser extends JInternalFrame{
    public JLabel lbl_full_name, lbl_email, lbl_contact;
    private JTextField txt_full_name, txt_email, txt_contact;
    JButton btn_add, btn_reset;
    public AddUser(){
        lbl_full_name = new JLabel("Enter Fullname: ");
        lbl_email = new JLabel("Enter Email: ");
        lbl_contact= new JLabel("Enter Fullname: ");
        txt_full_name = new JTextField();
        txt_email = new JTextField();
        txt_contact = new JTextField();
        btn_add = new JButton("AddUser");
        btn_reset = new JButton("Reset");
        setSize(400,500);
        setTitle("Add User");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GridLayout gl = new GridLayout();
        
    }
}
