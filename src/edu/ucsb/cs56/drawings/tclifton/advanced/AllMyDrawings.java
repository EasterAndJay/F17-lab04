package edu.ucsb.cs56.drawings.tclifton.advanced;

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
 * @author Thomas Cliffton 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    
    public static void drawPicture1(Graphics2D g2) {
	Fan f1 = new Fan(100,100,100,100);
	g2.setColor(Color.BLACK);
	g2.draw(f1);

	Shape f2 = ShapeTransforms.scaledCopyOfLL(f1,0.5,0.5);
	f2 = ShapeTransforms.translatedCopyOf(f2,150,0);
	g2.setColor(Color.CYAN);
	g2.draw(f2);

	f2 = ShapeTransforms.scaledCopyOfLL(f2,4,4);
	f2 = ShapeTransforms.translatedCopyOf(f2,150,0);
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(f2);


	
	DeskFan df1 = new DeskFan(100,300,100,100);
	DeskFan df2 = new DeskFan(200,300,100,100);

	g2.draw(df1);
	g2.setColor(new Color(0x8F00FF));
	g2.draw(df2);
        
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few fans by Thomas Clifton", 20,20);
    }
    
    
    
    public static void drawPicture2(Graphics2D g2) {
	DeskFan df1 = new DeskFan(100,100,100,100);
	DeskFan df2 = new DeskFan(300,100,100,100);

	g2.setColor(Color.RED);     g2.draw(df1);
	g2.setColor(Color.GREEN);   g2.draw(df2);

	Fan f1 = new Fan(200,100,100,100);
	g2.setColor(Color.BLACK);   g2.draw(f1);

	Shape f2 = ShapeTransforms.rotatedCopyOf(f1,Math.PI/4.0);
	g2.draw(f2);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of desk fans and fans by Thomas Clifton", 20,20);
    }
    
    
    public static void drawPicture3(Graphics2D g2) {
	DeskFan df1 = new DeskFan(100,100,100,100);
	DeskFan df2 = new DeskFan(100,300,100,100);
	g2.draw(df1); g2.draw(df2);

	Fan f1 = new Fan(100,100,100,100);
	Shape f2 = ShapeTransforms.rotatedCopyOf(f1,Math.PI/4.0);
	
	// label the drawing
	
	g2.drawString("Some fans by Thomas Clifton", 20,20);
    }       
}
