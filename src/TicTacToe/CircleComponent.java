package TicTacToe;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
/**
 * Creates a circle and calculates area and circumference
 * @author Ian Van Schaick
 */
public class CircleComponent extends JComponent{
    double radius;
    
    /**
     * Creates a circle object
     */
    public CircleComponent (int r) {
        radius = r;
    }
    
    /**
     * Sets radius and call areaCalc and perimCalc
     */
    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Construct a rectangle and draw it
        Ellipse2D.Double box = new Ellipse2D.Double(20.0, 20.0, radius, radius);
        g2.setStroke(new BasicStroke(3));
        g2.setPaint(Color.blue);
        g2.draw(box);
    }
}