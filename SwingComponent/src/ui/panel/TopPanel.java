package ui.panel;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class TopPanel extends JPanel{
      JMenuBar jmb;
      JMenu user,setting;
      JMenuItem user_list, user_add, profile, logout;
    public TopPanel(){
      jmb = new JMenuBar();
      user = new JMenu("Users", true);
      setting = new JMenu("Settings", true);
      
      user_list = new JMenuItem("Show User");
      user_add = new JMenuItem("Add User");
      user_add = new JMenuItem("Profile");
      user_add = new JMenuItem("Logout");
      
      user.add(user_list,0);
      user.add(user_add,1);
      setting.add(profile,0);
      user.add(logout,1);
      
      jmb.add(user);
      jmb.add(setting);
      add(jmb, new BorderLayout().NORTH);
    }
    public Image loadImage(String url, int width, int height){
        Image img = null;
        try{
            ImageIcon icon = new ImageIcon(TopPanel.class.getResource(url));
            img = icon.getImage().getScaledInstance(width)
        }
    }
}
