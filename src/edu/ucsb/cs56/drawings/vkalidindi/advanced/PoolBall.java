package edu.ucsb.cs56.drawings.vkalidindi.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;


/**
   A PoolBall
      
   @author Vamsi Kalidindi 
   @version for CS56, F17, UCSB
   
*/
public class PoolBall extends Ball implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public PoolBall(double x, double y, double w, double h)
    {
	
        // construct the basic ball shell
        super(x,y,w,h);


        // get the GeneralPath that we are going to append stuff to
        GeneralPath gp = this.get();

	double r = w;

        // Make a smaller circle, where r2 = r/2.0;

        // The inside circle that contains the number will be half the size of the ball circle

        double smallw = r/2;
	double smallh = r/2;

	

	double lineY1 = y - (0.5*r);
	double lineY2 = y + (0.5*r);

	//Ellipse2D.Double bigcircle = new Ellipse2D.Double(x, y, w, y);

        Ellipse2D.Double smallcircle = new Ellipse2D.Double(x, y, smallw, smallh);
	//Line2D.Double number = new Line2D.Double(x, x, lineY1, lineY2);


        // add the windows to the house
        // Look up the meaning of the second parameter of append
        // (Hint--is a method of "GeneralPath")


        // add small small circle and number to the ball!!!



        GeneralPath wholeBall = this.get();
	//wholeBall.append(bigcircle, false);
        wholeBall.append(smallcircle, false);
        //wholeBall.append(number, false);
        //wholeHouse.append(win3, false);
    }
}

