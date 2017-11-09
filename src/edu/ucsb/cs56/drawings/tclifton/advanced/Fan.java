package edu.ucsb.cs56.drawings.tclifton.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Line2D; 
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Fan that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Thomas Clifton 
   @version for CS56, F17, UCSB
   
*/
public class Fan extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of upper left corner of fan
       @param y y coord of upper left corner of fan
       @param radius radius of the fan's total area
    */
    public Fan(double x, double y, double height, double width)
    {
	double radius = height;
        double centerCircleRadius = radius / 4;
	double bladeLength = .375 * radius;

	Ellipse2D.Double center =
	    new Ellipse2D.Double(x+radius*.375,y+radius*.375,centerCircleRadius,centerCircleRadius);

        Line2D.Double north =
	    new Line2D.Double(x+radius/2,y,x+radius/2,y+radius*.375);
	Line2D.Double south =
	    new Line2D.Double(x+radius/2,y+radius,x+radius/2,y+radius*.625);
        Line2D.Double east =
	    new Line2D.Double(x,y+radius/2,x+radius*.375,y+radius/2);
        Line2D.Double west =
	    new Line2D.Double(x+radius,y+radius/2,x+radius*.625,y+radius/2);

	GeneralPath wholeFan = this.get();
	wholeFan.append(center,false);
	wholeFan.append(north,false);
	wholeFan.append(south,false);
	wholeFan.append(east,false);
	wholeFan.append(west,false);   
    }
}
