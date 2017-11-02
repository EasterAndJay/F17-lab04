package edu.ucsb.cs56.drawings.ehenderson.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * 
 * @author Ethan Henderson
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture of a Smartphone 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Smartphone s1 = new Smartphone(50,400,200,390);
	g2.setColor(Color.BLACK); 
	s1.addCamera();
	s1.addHome();
	g2.draw(s1);



	g2.drawString("A Smartphone by Ethan Henderson", 20,20);
    }
    
   /** Draw a picture of a Samsung Galaxy S7
    */

    public static void drawPicture2(Graphics2D g2) {
	
	double x = 50;
	double y = 400;
	double width = 200;
	double height = 390;
	
    	Samsung s1 = new Samsung(x, y, width, height);
	g2.setColor(Color.BLACK); 
	
	s1.addCamera(); 
	s1.addHome();
	s1.addFlash();
	s1.addSpeaker();
	g2.draw(s1);


	g2.drawString("A Samsung Galaxy S7 by Ethan Henderson", 20,20);	
	
    }       

    /** Draw a picture of both phones side-by-side
     */

    public static void drawPicture3(Graphics2D g2) {
	
	double x = 50;
	double y = 400;
	double width = 200;
	double height = 390;

	Smartphone s1 = new Smartphone(x, y, width, height);
	s1.addCamera();
	s1.addHome();
	g2.draw(s1);

	Samsung gs1 = new Samsung((2*x + width), y, width, height);
	
	gs1.addCamera();
	gs1.addHome();
	gs1.addFlash();
	gs1.addSpeaker();
	g2.draw(gs1);

	g2.drawString("A Smartphone and a Samsung Galaxy S7 by Ethan Henderson", 20, 20);
    }	

}
