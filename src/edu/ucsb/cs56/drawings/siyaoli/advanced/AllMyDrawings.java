package edu.ucsb.cs56.drawings.siyaoli.advanced;

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
 * @author Siyao Li 
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few pairs of Pants 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	//make a cyan pant
	Pant p1 = new Pant(100,100,50,75);
	g2.setColor(Color.CYAN); g2.draw(p1);
	
	// Make a black pair of pant that's half the size, 
	// and moved over 150 pixels in x direction
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	g2.setColor(Color.BLACK); g2.draw(p2);
	
	// Here's a pair of pant that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	p2 = ShapeTransforms.scaledCopyOfLL(p2,4,4);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(p2); 
	
	// Draw two pairs of pants with back pocket
	
	PantWithBackPocket pp1 = new PantWithBackPocket(50,250,40,75);
	PantWithBackPocket pp2 = new PantWithBackPocket(200,250,200,100);
	
	g2.draw(pp1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(pp2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few pairs of pants by Siyao Li", 20,20);
    }
    
    
    /** Draw a picture with a few pairs of pants
     */
    public static void drawPicture2(Graphics2D g2) {
	Pant p1 = new Pant(100,100,50,75);
	g2.setColor(Color.GREEN); g2.draw(p1);
	
	// Make a black pair of pant that's half the size, 
	// and moved over 150 pixels in x direction
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,-100);
	g2.setColor(Color.BLACK); g2.draw(p2);
	
	// Here's a pair of pant that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	p2 = ShapeTransforms.scaledCopyOfLL(p2,4,4);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,200);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x003FA3));
	Shape p3 = ShapeTransforms.rotatedCopyOf(p2, 3*Math.PI/4.0);

	g2.draw(p3); 
	
	// Draw two pairs of pants with back pocket
	
	PantWithBackPocket pp1 = new PantWithBackPocket(50,250,40,75);
	PantWithBackPocket pp2 = new PantWithBackPocket(200,250,200,100);
	
	g2.draw(pp1);
	g2.setColor(new Color(0x8F081F));
	
	// Rotate the second house 45 degrees around its center.
	Shape pp3 = ShapeTransforms.rotatedCopyOf(pp2, Math.PI/4.0);
	
	g2.draw(pp3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few pairs of pants by Siyao Li", 20,20);
    }
    
    /** Draw a different picture with a few pairs of pants
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A few pairs of pants by Siyao Li", 20,20);
	
	
	// Draw pairs of pants.
	
	PantWithBackPocket large = new PantWithBackPocket(100,50,225,150);
	PantWithBackPocket small = new PantWithBackPocket(20,50,40,30);
	Pant p1 = new Pant(200, 100, 120, 80);
	Shape p2 = ShapeTransforms.rotatedCopyOf(p1, Math.PI/2.0);

	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.YELLOW); g2.draw(p2);
    }       
}
