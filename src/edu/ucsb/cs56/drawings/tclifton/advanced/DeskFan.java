package edu.ucsb.cs56.drawings.tclifton.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Ellipse2D;

/**
   A Fan enclosed in a circle
      
   @author Thomas Clifton 
   @version for CS56, F17, UCSB
   
*/
public class DeskFan extends Fan implements Shape
{
    /**
     * Constructor for objects of class DeskFan
     */
    public DeskFan(double x, double y, double width, double height)
    {
	// construct the basic house shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	Ellipse2D.Double e =
	    new Ellipse2D.Double(x,y,width,height);

	GeneralPath wholeFan = this.get();
	wholeFan.append(e,false);
    }    
}
