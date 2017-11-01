package edu.ucsb.cs56.drawings.ehenderson.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A drawing of a  Smarthphone that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Ethan Henderson
   @version for CS56, F17, UCSB
   
*/
public class Smartphone extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of upper left corner of Smartphone
       @param y y coord of upper left corner of Smartphone
       @param width width of the Smartphone
       @param height of Smartphone
    */
    public Smartphone(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   .
       	y = 500 - y; 
        double screenHeight = .80 * height;
        double splitHeightY = (height - screenHeight)/2;
	double splitLengthX = .05 * width;
        double screenUpperLeftY = y+ (.1*height) ;
        
        // Make the Smartphone screen
        
        Rectangle2D.Double screen = 
            new Rectangle2D.Double(x + splitLengthX, screenUpperLeftY ,
				   width-(2*splitLengthX), screenHeight);
	
        // make the Smartphone body.
        
        Rectangle2D.Double smartphone = 
	    new Rectangle2D.Double(x, y, width, height);	

	
        // put the whole Smartphone together
	
        GeneralPath wholePhone = this.get();
        wholePhone.append(screen, false);
        wholePhone.append(smartphone, false);


    }      
}
