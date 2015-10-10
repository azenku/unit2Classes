import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;
import java.awt.Rectangle;
/**
 * Write a description of class Night here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Night
{
    /** description of instance variable x (add comment for each instance variable) */
    private Rectangle bounds;

    /**
     * Default constructor for objects of class Night
     */
    public void Night()
    {
         bounds = new Rectangle(50, 50, 50, 50);
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        //night
        Rectangle sky = new Rectangle(0,0,1750,1000);
        GradientPaint nighty = new GradientPaint(500,-100, new Color(12,1,79), 1056, 2500,
        Color.yellow);
        g2.setPaint(nighty);
        g2.fill(sky);
        Ellipse2D.Double sun = new Ellipse2D.Double(1675, -20,100,100);
        //g2.draw(sun);
        g2.setPaint(new Color(255,255,134));
        g2.fill(sun);
        g2.draw(sun);
        // door and building
        Rectangle bounds = new Rectangle(150, 150, 150, 400);
        Rectangle bounds2 = new Rectangle(190, 500, 50, 50);
        Rectangle bounds3 = new Rectangle(210, 500, 50, 50);
        // windows
        Rectangle bounds4 = new Rectangle(190, 495, 70, 5);
        //ground
        g2.setColor(Color.white); 
        Rectangle bounds5 = new Rectangle(210, 500, 30, 50);
        g2.fill(bounds5); 
        g2.setColor(Color.gray); 
        g2.fill(bounds); 
        Rectangle bounds6 = new Rectangle(200, 350, 50, 50);
        Rectangle bounds7 = new Rectangle(200, 225, 50, 50);
        g2.setColor(new Color(240,230,140)); 
        g2.fill(bounds6);
        g2.setColor(new Color(240,230,140));
        g2.fill(bounds7);
        g2.setColor(new Color(211,211,211));
        g2.fill(bounds2);
        g2.fill(bounds3);
        g2.fill(bounds4);
        g2.setColor(new Color(240,230,140)); 
        g2.fill(bounds5); 
        
        
        
        g2.setColor(Color.black);
        
        
        //g2.setColor(Color.gray); 
        //g2.fill(bounds); 
        g2.draw(bounds);
        g2.draw(bounds2);
        g2.draw(bounds3);
        g2.draw(bounds4);
        g2.draw(bounds5);
        g2.draw(bounds6);
        g2.draw(bounds7);
    }

}
