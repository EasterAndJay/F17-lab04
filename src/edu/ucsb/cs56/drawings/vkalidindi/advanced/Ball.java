package edu.ucsb.cs56.drawings.vkalidindi.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


/**
   A vector drawing of a ball that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Vamsi Kalidindi 
   @version for CS56, F17, UCSB
   
*/

public class Ball extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of upper left corner of ball
       @param y y coord of upper left corner of ball
       @param w width of ball
       @param h height of ball

    */
    public Ball(double x, double y, double w, double h)
    {

	    Ellipse2D circle = new Ellipse2D.Double();
    		circle.setFrameFromCenter(x, y, w, h);
    	

	    GeneralPath wholeBall = this.get();
	    wholeBall.append(circle, false);
     
    }
  
  
 

}

