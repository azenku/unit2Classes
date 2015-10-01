
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
    public void draw(int x, int y)
    {
        // put your code here
        Rectangle thing = new Rectangle(x,y);
        return thing;
    }

}
