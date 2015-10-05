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
public class Ground
{
    /** description of instance variable x (add comment for each instance variable) */
    private Rectangle bounds;

    /**
     * Default constructor for objects of class Tower
     */
    public void Ground()
    {
         
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the methodbouiun
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        
        //ground
        Rectangle gro1 = new Rectangle(0, 550, 800, 50);
        Rectangle gro2 = new Rectangle(0, 600, 1750, 250);
        
        
        g2.draw(gro1);
        g2.draw(gro2);
    }

}
