package edu.ucsb.cs56.drawings.jhertzberg.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
/**
   A Face
      
   @author Phill Conrad 
   @author Yossi Hertzberg
   @version for CS56, W16, UCSB
   
*/
public class FaceWithMustache extends Face implements Shape
{
    /**
     * Constructor for objects of class FaceWithMustache
     */
    public FaceWithMustache(double x, double y, double r, double distToMouth)
    {
	// construct the basic face shell
	super(x,y,r,distToMouth);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	//
	
	double radius = r;	
	double h = r/2;
	double mx1 = x + radius;
	double my = y + distToMouth;
	double mx2 = mx1 + radius + radius;
	Line2D.Double one =
	    new Line2D.Double(mx1, my, mx1, my - h);
	Line2D.Double two =
	    new Line2D.Double(mx1 + radius, my, mx1+radius, my-h);
	Line2D.Double three =
	    new Line2D.Double(mx1 + 2*radius, my, mx1 + 2*radius, my-h);
	Line2D.Double four =
		new Line2D.Double(mx1 + radius/2, my, mx1+radius/2, my-h);
	Line2D.Double five =
		new Line2D.Double(mx1 + 3*radius/2, my, mx1 + 3*radius/2, my-h);

	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeFace = this.get();
        wholeFace.append(one, false);
        wholeFace.append(two, false);
        wholeFace.append(three, false); 
	wholeFace.append(four,false);
	wholeFace.append(five,false);
    }    
}
