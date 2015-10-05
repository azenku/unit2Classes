import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    Rectangle bounds = new Rectangle(0, 0, -1, -1);
    
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    
    
    
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Tower blah = new Tower();
        Ground peer = new Ground();
        // invoke the draw method on each object in your Cityscape
        // ...
        blah.draw(g2);
        peer.draw(g2);
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
