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
        Rectangle gro2 = new Rectangle(0, 600, 1750, 500);
        
        Rectangle pil = new Rectangle(50, 600, 25, 500);
        Rectangle pil2 = new Rectangle(250, 600, 25, 500);
        Rectangle pil3 = new Rectangle(450, 600, 25, 500);
        Rectangle pil4 = new Rectangle(650, 600, 25, 500);
        
        
        g2.setColor(new Color(139,69,19));
        g2.fill(gro1);
        
        
        
        
        g2.setColor(new Color(0,191,255));
        g2.fill(gro2);
        
        
        g2.setColor(new Color(189,183,107));
        g2.fill(pil);
        g2.fill(pil2);
        g2.fill(pil3);
        g2.fill(pil4);
        
        
        g2.setColor(Color.black);
        g2.draw(gro1);
        g2.draw(gro2);
        g2.draw(pil);
        g2.draw(pil2);
        g2.draw(pil3);
        g2.draw(pil4);
        
    }

}
