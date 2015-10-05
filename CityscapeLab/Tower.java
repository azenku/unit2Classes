import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower
{
    /** description of instance variable x (add comment for each instance variable) */
    private Rectangle bounds;

    /**
     * Default constructor for objects of class Tower
     */
    public void Tower()
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
        // door and building
        Rectangle bounds = new Rectangle(150, 150, 150, 400);
        Rectangle bounds2 = new Rectangle(190, 500, 50, 50);
        Rectangle bounds3 = new Rectangle(210, 500, 50, 50);
        // windows
        Rectangle bounds4 = new Rectangle(190, 495, 70, 5);
        //ground
        //Rectangle bounds5 = new Rectangle(0, 550, 1000, 100);
        g2.setColor(Color.gray); 
        g2.fill(bounds); 
        Rectangle bounds6 = new Rectangle(200, 350, 50, 50);
        Rectangle bounds7 = new Rectangle(200, 225, 50, 50);
        g2.setColor(Color.white); 
        g2.fill(bounds6);
        g2.setColor(Color.white);
        g2.fill(bounds7);
        g2.setColor(Color.black);
        //g2.setColor(Color.gray); 
        //g2.fill(bounds); 
        g2.draw(bounds);
        g2.draw(bounds2);
        g2.draw(bounds3);
        g2.draw(bounds4);
        //g2.draw(bounds5);
        g2.draw(bounds6);
        g2.draw(bounds7);
    }

}
