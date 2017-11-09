package edu.ucsb.cs56.drawings.siyaoli.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A Pair of Pant (wrapper around a General Path, implements Shape).   
      
   @author Siyao Li 
   @version for CS56, F17, UCSB
   
*/
public class Pant extends GeneralPathWrapper implements Shape
{   
    /**
     * Constructor for objects of class Pant
     */
    public Pant(double x, double y, double width, double height)
    {
	
        // Specify the upper left corner, and the 
        //  width and height of the original points used to 
        //  plot the *hard-coded* Pant
        
        final double ORIG_ULX = 0; 
        final double ORIG_ULY = 0; 
        final double ORIG_HEIGHT = 540.0;
        final double ORIG_WIDTH = 320.0; 
        
        GeneralPath leftSide = new GeneralPath();
	
        // left side of cup
	leftSide.moveTo(160,30);
        leftSide.lineTo(160,10);
        leftSide.lineTo(50,0);
	leftSide.lineTo(45,20);
	leftSide.lineTo(160,30);
	leftSide.moveTo(45,20);
        leftSide.lineTo(0,530);
        leftSide.lineTo(130,540);
        leftSide.lineTo(160,170);
	leftSide.lineTo(160,10);

        Shape rightSide = ShapeTransforms.horizontallyFlippedCopyOf(leftSide);
       
        // after flipping around the upper left hand corner of the
        // bounding box, we move this over to the right by 160 pixels
       
        rightSide = ShapeTransforms.translatedCopyOf(rightSide, 320.0, 0.0);
       
        // now we put the whole thing together ino a single path.
       
        GeneralPath wholePant = new GeneralPath ();
        wholePant.append(leftSide, false);
        wholePant.append(rightSide, false);

        // then translate to (x,y) 
        Shape s = ShapeTransforms.translatedCopyOf(wholePant,  x,  y);
 
	// scale to correct height and width
        s =  ShapeTransforms.scaledCopyOf(s,
					  width/ORIG_WIDTH,
					  height/ORIG_HEIGHT) ;
	        
	this.set(new GeneralPath(s));
        
    }

}
