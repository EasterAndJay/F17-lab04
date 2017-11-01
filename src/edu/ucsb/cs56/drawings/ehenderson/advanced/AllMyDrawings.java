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
	
	Smartphone s1 = new Smartphone(50,400,200,390);
	g2.setColor(Color.BLACK); g2.draw(s1);

        double camX = 150;
        double camY = 119.5;
        double camR = 10;

	Circle camera = new Circle(camX, camY, camR);
        g2.draw(camera);
	
	double homeX = 150;
	double homeY = 470.5;
	double homeR = 15;

	Circle home = new Circle(homeX, homeY, homeR);
	g2.draw(home);


	g2.drawString("A Smartphone by Ethan Henderson", 20,20);
    }
    
   /** Draw a picture of a Samsung Galaxy S7
    */

    public static void drawPicture2(Graphics2D g2) {
	
    	Samsung s1 = new Samsung(50,550,250,450);
	g2.setColor(Color.BLACK); g2.draw(s1);

	g2.drawString("A Samsung Galaxy S7 by Ethan Henderson", 20,20);	
	
    }       
}
