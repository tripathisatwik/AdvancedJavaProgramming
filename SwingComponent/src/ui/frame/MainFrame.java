package ui.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import ui.panel.BottomPanel;
import ui.panel.MainPanel;
import ui.panel.TopPanel;

public class MainFrame extends JFrame{
    MainPanel mp;
    BorderLayout bp;
    TopPanel tp;
    public MainFrame(){
        setSize(600,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Dashboard");
        bl = new BorderLayot();
        setlayout(bl);
        //adding main panel
        tp = new TopPanel();
        mp = new MainPanel();
        bp = new BottomPanel();
           
        add(tp,bl.NORTH);
        add(tp,bl.CENTER);
        add(tp,bl.SOUTH);
        
        tp.user_add.addActionListener(new ActionListener){
            @Override
            }
    }
    }
}
