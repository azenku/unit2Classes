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
    private Point2D.Double dot1;
    private Point2D.Double dot2;
    private Point2D.Double dot3;
    private Point2D.Double dot4;
    private Line2D.Double line1;
    private Line2D.Double line2;
    private Line2D.Double line3;
    private Line2D.Double line4;
    
    
    private int xd1;
    private int xd2;
    private int xd3;
    private int xd4;
    
    private int yd1;
    private int yd2;
    private int yd3;
    private int yd4;
    
    
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
       
       this.xd1 = x1+100;
       this.xd2 = x1+200;
       this.xd3 = x1+400;
       this.xd4 = x1+500;
       
       this.yd1 = y1+100;
       this.yd2 = y1;
       this.yd3 = y1;
       this.yd4 = y1+-100;
       
       
       this.dot1 = new Point2D.Double(x1 + 100, y1 - 100); 
       this.dot2 = new Point2D.Double(x1 + 200, y1); 
       this.dot3 = new Point2D.Double(x1 + 400, y1); 
       this.dot4 = new Point2D.Double(x1 + 500, y1 - 100); 
       this.line1 = new Line2D.Double(dot1,dot2);
       this.line2 = new Line2D.Double(dot2,dot3);
       this.line3 = new Line2D.Double(dot3,dot4);
       this.line4 = new Line2D.Double(dot1,dot4);
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
       //Point2D.Double dot1 = new Point2D.Double(x1 + 100, y1 - 100); 
       //Point2D.Double dot2 = new Point2D.Double(x1 + 200, y1); 
       //Point2D.Double dot3 = new Point2D.Double(x1 + 400, y1); 
       //Point2D.Double dot4 = new Point2D.Double(x1 + 500, y1 - 100); 
       //Line2D.Double line1 = new Line2D.Double(dot1,dot2);
       //Line2D.Double line2 = new Line2D.Double(dot2,dot3);
       //Line2D.Double line3 = new Line2D.Double(dot3,dot4);
       //Line2D.Double line4 = new Line2D.Double(dot1,dot4);
       g2.draw(line1);
       g2.draw(line2);
       g2.draw(line3);
       g2.draw(line4);
    }

    
    public void move()
    {
        this.xd1+= 10;
        this.xd2+= 10;
        this.xd3+= 10;
        this.xd4+= 10;
        
        
        
        
        
        
        this.line1.setLine(xd1+10,yd1,xd2+10,yd2);
        this.line2.setLine(xd2+10,yd2,xd3+10,yd3);
        this.line3.setLine(xd3+10,yd3,xd4+10,yd4);
        this.line4.setLine(xd4+10,yd4,xd1+10,yd1);
    }
}
