package edu.ucsb.cs56.drawings.vkalidindi.advanced;

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
 * @author Vamsi Kalidindi 
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a couple balls
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	
	// Draw two poolballs.
	
	PoolBall hw1 = new PoolBall(200,200,50,50);
	PoolBall hw2 = new PoolBall(100,100,60,60);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	//g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few balls by Vamsi Kalidindi", 20,20);
    }
    
    
    /** Draw a picture with a few more balls
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some PoolBalls.
	
	    
	PoolBall hw3 = new PoolBall(150,200,75,75);
	PoolBall hw4 = new PoolBall(400,400,60,60);

	g2.setColor(Color.MAGENTA); g2.draw(hw3);
	g2.setColor(Color.RED); g2.draw(hw4);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setColor(Color.BLACK); 
	g2.drawString("A couple more Pool balls by Vamsi Kalidindi", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Pool Balls by Vamsi Kalidindi", 20,20);
	
	
	// Draw some PoolBalls.
	
	PoolBall hw03 = new PoolBall(100,100,60,60);
	PoolBall hw04 = new PoolBall(200,200,40,40);
	PoolBall hw05 = new PoolBall(400,250,50,50);
	
	g2.setColor(Color.RED);     g2.draw(hw03);
	g2.setColor(Color.GREEN);   g2.draw(hw04);
	g2.setColor(Color.BLUE);    g2.draw(hw05);
	
    }       
}
