package edu.ucsb.cs56.drawings.jhertzberg.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a face that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Phill Conrad
   @author Yossi Hertzberg 
   @version for CS56, W16, UCSB
   
*/
public class Face extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of upper left eye
       @param y y coord of upper left eye
       @param r radius of eye
       @param distToMouth distance down from eyes to mouth
     
    */
    public Face(double x, double y, double r, double distToMouth)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
	double radius = r;        
        double xSecondEye = x + radius + radius + radius;
        double ySecondEye = y;
	
	double mouthLeftX = x + radius;
	double mouthLeftY = y + distToMouth;
	double mouthRightX = xSecondEye;
	double mouthRightY = mouthLeftY;
        
	double width = radius/2;
        double noseX = x + radius + radius - width/4;
	double noseY = y + radius;
	double noseWidth = radius/2;
	double noseHeight =  radius/2;
        

	Ellipse2D.Double leftEye = new Ellipse2D.Double(x,y,radius,radius);
	Ellipse2D.Double rightEye = new Ellipse2D.Double(xSecondEye,ySecondEye,radius,radius);

	Line2D.Double mouth = new Line2D.Double(mouthLeftX,mouthLeftY,mouthRightX,mouthRightY);

	Rectangle2D.Double nose = new Rectangle2D.Double(noseX,noseY,noseWidth,noseHeight);

        // Make the face
	
        GeneralPath wholeFace = this.get();
        wholeFace.append(leftEye, false);
        wholeFace.append(rightEye, false);
        wholeFace.append(mouth, false);   
        wholeFace.append(nose,false);	
    }
}
