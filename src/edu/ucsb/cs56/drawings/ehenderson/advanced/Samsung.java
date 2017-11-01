package edu.ucsb.cs56.drawings.ehenderson.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   
   Picture of a Samsung Galazy S7
      
   @author Phill Conrad 
   @author Ethan Henderson
   @version for CS56, F17, UCSB
   
*/
public class Samsung extends Smartphone implements Shape
{
    /**
       Constructor
       
       @param x x coord of upper left corner of phone
       @param y y coord of upper left corner of phone
       @param width width of the phone
       @param height of phone
    */
    public Samsung(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        super(x, y, width, height); 

	Rectangle2D.Double home = new Rectangle2D.Double(50, 50, 100, 100);
       
	GeneralPath gp = this.get();
        
	
        //  Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
	
        // put the whole Galaxy S7 together
	
        GeneralPath wholePhone = this.get();
	wholePhone.append(home, false);
    }
}
