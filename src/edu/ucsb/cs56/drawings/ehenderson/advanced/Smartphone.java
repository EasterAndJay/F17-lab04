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
       
       @param x x coord of lower left corner of Smartphone
       @param y y coord of lower left corner of Smartphone
       @param width width of the Smartphone
       @param height of Smartphone
    */
    public Smartphone(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   .
        
        double screenHeight = .70 * height;
        double splitHeightY = (height - screenHeight)/2;
	double splitLengthX = .05 * width;
        double screenUpperLeftY = (y - height)+ splitHeightY;
        double phoneHeight = screenUpperLeftY - (splitHeightY/5);
        
        // Make the Smartphone screen
        
        Rectangle2D.Double screen = 
            new Rectangle2D.Double(x + splitLengthX, screenUpperLeftY ,
				   width-(2*splitLengthX), y - (2*splitHeightY));
	
        // make the Smartphone body.
        
        Rectangle2D.Double smartphone = 
	    new Rectangle2D.Double(x, phoneHeight, width, height);	

	//Make the camera
	
	Circle camera = new Circle ((x+(width/2)), phoneHeight + 10, (.35 * (splitHeightY/6)));

	//Make the home button
	
	Circle home = new Circle ((x+(width/2)), y+splitHeightY-(splitHeightY/3), (.5 * (splitHeightY/6)));
	
        // put the whole Smartphone together
	
        GeneralPath wholePhone = this.get();
        wholePhone.append(screen, false);
        wholePhone.append(smartphone, false);
	wholePhone.append(camera, false);
	wholePhone.append(home, false);
    }
}
