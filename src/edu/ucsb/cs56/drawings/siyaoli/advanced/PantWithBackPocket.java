package edu.ucsb.cs56.drawings.siyaoli.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A pair of pants with back pocket
      
   @author Siyao Li 
   @version for CS56, F17, UCSB
   
*/
public class PantWithBackPocket extends Pant implements Shape
{
    /**
     * Constructor for objects of class PantWithBackPocket
     */
    public PantWithBackPocket(double x, double y, double width, double height)
    {
	// construct the basic pant shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	//translate to the original state
	final double ORIG_HEIGHT = 540.0;
        final double ORIG_WIDTH = 320.0;
	Shape s = ShapeTransforms.translatedCopyOf(gp, -x,  -y);
	s =  ShapeTransforms.scaledCopyOf(s,
					  ORIG_WIDTH/width,
					  ORIG_HEIGHT/height) ;
	
	// draw two back pocket to the pant
	GeneralPath pocket = new GeneralPath();
	pocket.moveTo(140,50);
	pocket.lineTo(60, 40);
	pocket.lineTo(60, 130);
	pocket.lineTo(90, 160);
	pocket.lineTo(130, 140);
	pocket.lineTo(140,50);
	Shape rightPocket = ShapeTransforms.horizontallyFlippedCopyOf(pocket);
	rightPocket = ShapeTransforms.translatedCopyOf(rightPocket,200,0);
	GeneralPath wholePocket = new GeneralPath();
	wholePocket.append(pocket, false);
	wholePocket.append(rightPocket, false);
	wholePocket.append(s, false);

	//modify the pocket's position and size
	Shape ns = ShapeTransforms.translatedCopyOf(wholePocket,  x,  y);
        ns =  ShapeTransforms.scaledCopyOf(ns,
					  width/ORIG_WIDTH,
					  height/ORIG_HEIGHT) ;
	
	// update the picture
	GeneralPath wholePant = this.get();
        wholePant.append(ns, false);

    }    
}
