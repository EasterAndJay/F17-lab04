package edu.ucsb.cs56.drawings.derenlei.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
   A House

   @author Deren Lei
   @version for CS56, F17, UCSB

*/
public class BowlingBall extends Ball implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public BowlingBall(double x, double y, double width, double height)
    {
	// construct the basic ball
	super(x,y,width,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	// Make three holes, spaced like this;
	// | |  | |  | |  | |  | |
	// | |  | |  | |  | |  | |
	// | |  | |  |O|  | |  | |
	// | |  |O|  | |  |O|  | |
	// | |  | |  | |  | |  | |
	// The top of window will be at y + 0.5*height and the
	// height of the window is 0.25height;

	double x1 = x + width * 0.5;
	double x2 = x1 - width * 0.1 * 1;
	double x3 = x1 + width * 0.1 * 1;
	double y1 = y + height * 0.7;
	double y2 = y1 + height * 0.1 * 1;
	double y3 = y2;
	
        Ellipse2D.Double circle1 = new Ellipse2D.Double(x1, y1, width*0.1, height*0.1);
	Ellipse2D.Double circle2 = new Ellipse2D.Double(x2, y2, width*0.1, height*0.1);
	Ellipse2D.Double circle3 = new Ellipse2D.Double(x3, y3, width*0.1, height*0.1);
	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")

        GeneralPath wholeHouse = this.get();
        wholeHouse.append(circle1, false);
        wholeHouse.append(circle2, false);
        wholeHouse.append(circle3, false);
    }
}
