package edu.ucsb.cs56.drawings.tclifton.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Ball that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Thomas Clifton 
   @version for CS56, F17, UCSB
   
*/
public class Ball extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of house
       @param y y coord of lower left corner of house
       @param width width of the house
       @param height of house (including first story and second story)
    */
    public Ball(double x, double y, double radius)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double firstStoryHeight = .75 * height;
        double roofHeight = height - firstStoryHeight;
        
        double firstStoryUpperLeftY = y + roofHeight;
        
        // Make the first story
        
        Rectangle2D.Double firstStory = 
            new Rectangle2D.Double(x, firstStoryUpperLeftY ,
				   width, firstStoryHeight);
	
        // make the roof.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
        Line2D.Double leftRoof = 
            new Line2D.Double (x, y + roofHeight,
                               x + width/2.0, y);
	
        Line2D.Double rightRoof =
            new Line2D.Double (x + width/2.0, y,
                               x + width, y + roofHeight);
	
        // put the whole house together
	
        GeneralPath wholeHouse = this.get();
        wholeHouse.append(firstStory, false);
        wholeHouse.append(leftRoof, false);
        wholeHouse.append(rightRoof, false);    
    }
}
