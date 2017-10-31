package edu.ucsb.cs56.drawings.derenlei.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a ball that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   @author Deren Lei
   @version for CS56, F17, UCSB

*/
public class Ball extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coordinate of the bounding rectangle(upper left corner)
       @param y coordinate of the bounding rectangle(upper left corner)
       @param width width of the bounding rectangle
       @param height height of the bounding rectangle
    */
    public Ball(double x, double y, double width, double height)
    {

        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.


        // Make the circle

        Ellipse2D.Double circle =
            new Ellipse2D.Double(x, y,
				   width, height);


        // put the whole ball together

        GeneralPath wholeHouse = this.get();
        wholeHouse.append(circle, false);
    }
}
