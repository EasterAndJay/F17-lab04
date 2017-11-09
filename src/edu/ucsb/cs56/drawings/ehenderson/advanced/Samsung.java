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

	double X;
	double Y;
	double Width;
	double Height;
    /**
       Constructor

       @param x x coord of upper left corner of phone
       @param y y coord of upper left corner of phone
       @param width width of the phone
       @param height of phone
    */
    public Samsung(double x, double y, double width, double height)
    {
	
        super(x, y, width, height); 
	X = x;
	Y = 480-y;
	Width = width;
	Height = height;

	GeneralPath gp = this.get();
    }

    /**
     * Add a camera 
     */

    public void addCamera() {
	
	double camX = X + (.75*Width);
	double camY = Y + (.05*Height);
    	double camR = .02*Height;

	Circle camera = new Circle(camX, camY, camR);

	GeneralPath gp = this.get();
	gp.append(camera, false);
    }

    /**
     * Add a home button
     */

    public void addHome() {
	
	double homeX = X + (Width/3);
	double homeY = Y + (.925*Height);
	double homeW = (Width/3);
	double homeH = (.05*Height);

	Rectangle2D.Double home = new Rectangle2D.Double(homeX, homeY, homeW, homeH);

	GeneralPath gp = this.get();
	gp.append(home, false);
    }

    /** 
       Add 2 flash buttons to the phone
    */
    public void addFlash() {
	
	double fx1 = X + (.20*Width);
	double fy1 = Y + (.03*Height);
	double fr1 = .01*Height;

	Circle flash1 = new Circle(fx1, fy1, fr1);

	double fx2 = fx1 + (3*fr1);
	double fy2 = fy1;
	double fr2 = fr1;

	Circle flash2 = new Circle(fx2, fy2, fr2);

	GeneralPath gp = this.get();
	gp.append(flash1, false);
	gp.append(flash2, false);
    }
    
    /**
     * Add a Speaker Bar
     */
    public void addSpeaker() {
	
	double sx = X + (Width/3);
	double sy = Y + (.03*Height);
	double sW = (.25*Width);
	double sH = .012 * Height;

	Rectangle2D.Double speaker = new Rectangle2D.Double(sx, sy, sW, sH);

	GeneralPath gp = this.get();
	gp.append(speaker, false);
    }

}
