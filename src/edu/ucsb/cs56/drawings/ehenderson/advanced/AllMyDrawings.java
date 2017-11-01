package edu.ucsb.cs56.drawings.ehenderson.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad 
 * @author Ethan Henderson
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture of a Smartphone 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Smartphone s1 = new Smartphone(100,550,250,450);
	g2.setColor(Color.BLACK); g2.draw(s1);
	
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING*/
	
	//g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A Smartphone by Ethan Henderson", 20,20);
    }
    
    
    public static void drawPicture2(Graphics2D g2) {
	
	
    }       
}
