package tictactoe;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ian Van Schaick
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


public class XComponent extends JComponent {
    int x1;
    int y1;
    
    int x2;
    int y2;
    
    int x3;
    int y3;
    
    int x4;
    int y4;
    
    public XComponent () {
        x1 = 20;
        y1 = 20;
        
        x2 = 100;
        y2 = 20;
        
        x3 = 20;
        y3 = 100;
        
        x4 = 100;
        y4 = 100;
    }
    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        g2.setPaint(Color.red);
        g2.drawLine(x1, y1, x4, y4);
        g2.drawLine(x2, y2, x3, y3);
    }
}
