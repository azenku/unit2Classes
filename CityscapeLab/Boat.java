import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
/**
 * Write a description of class Boat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boat


{
    private int x1;
    private int y1;
    /** description of instance variable x (add comment for each instance variable) */
    private Rectangle bounds;

    /**
     * Default constructor for objects of class Boat
     @param x
     */
    public Boat(int x,int y)
        {
         x1= x;
         y1= y;
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
       Point2D.Double dot1 = new Point2D.Double(x1 + 100, y1 - 100); 
       Point2D.Double dot2 = new Point2D.Double(x1 + 200, y1); 
       Point2D.Double dot3 = new Point2D.Double(x1 + 400, y1); 
       Point2D.Double dot4 = new Point2D.Double(x1 + 500, y1 - 100); 
       Line2D.Double line1 = new Line2D.Double(dot1,dot2);
       Line2D.Double line2 = new Line2D.Double(dot2,dot3);
       Line2D.Double line3 = new Line2D.Double(dot3,dot4);
       Line2D.Double line4 = new Line2D.Double(dot1,dot4);
       g2.draw(line1);
       g2.draw(line2);
       g2.draw(line3);
       g2.draw(line4);
    }

}
