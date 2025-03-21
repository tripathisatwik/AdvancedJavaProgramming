package main;
import java.awt.Color;
import java.awt.GradientPaint;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MainPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        //drawing rectamgle
        g2.fillRect(50, 50, 400, 100);
        g2.setColor(Color.red);
        
        //drawing circle
        g2.fillOval(50, 150, 250, 150);
        g2.setColor(Color.green);
        
        //drawing line
        g2.drawLine(50, 380, 400, 50);
        g2.setColor(Color.black);
       
        GradientPaint gp = new GradientPaint(50,250,Color.cyan,150,200,Color.magenta);
        g2.setPaint(gp);
        g2.fillOval(50, 400, 400, 250);
    }
}
