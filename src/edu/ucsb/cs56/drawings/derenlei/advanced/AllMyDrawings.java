package edu.ucsb.cs56.drawings.derenlei.advanced;

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
 * @version for UCSB CS56, W16
 */

public class AllMyDrawings
{
    /** Draw a picture with a few balls and bowling balls
     */

    public static void drawPicture1(Graphics2D g2) {

      	Ball b1 = new Ball(100,250,50,75);
      	g2.setColor(Color.CYAN); g2.draw(b1);

      	// Make a black ball that's half the size,
      	// and moved over 150 pixels in x direction

      	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
      	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
      	g2.setColor(Color.BLACK); g2.draw(b2);

      	// Here's a ball that's 4x as big (2x the original)
      	// and moved over 150 more pixels to right.
      	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
      	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);

      	// We'll draw this with a thicker stroke
      	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

      	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
      	// #002FA7 is "International Klein Blue" according to Wikipedia
      	// In HTML we use #, but in Java (and C/C++) its 0x

      	Stroke orig=g2.getStroke();
      	g2.setStroke(thick);
      	g2.setColor(new Color(0x8F00FF));
      	g2.draw(b2);

      	// Draw two houses with Windows

      	BowlingBall bb1 = new BowlingBall(50,350,40,75);
      	BowlingBall bb2 = new BowlingBall(250,350,200,100);

      	g2.draw(bb1);
      	g2.setColor(new Color(0x002FA7)); g2.draw(bb2);

      	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

      	g2.setStroke(orig);
      	g2.setColor(Color.BLACK);
      	g2.drawString("A few balls and bowling balls by Deren Lei", 20,20);
    }


    /** Draw a picture with a few more bowling balls and less balls
     */
    public static void drawPicture2(Graphics2D g2) {

      	// Draw some bowling balls.

      	BowlingBall large = new BowlingBall(100,50,225,150);
      	BowlingBall smallCC = new BowlingBall(20,50,40,30);
      	BowlingBall tallSkinny = new BowlingBall(20,150,20,40);
      	BowlingBall shortFat = new BowlingBall(20,250,40,20);

      	g2.setColor(Color.RED);     g2.draw(large);
      	g2.setColor(Color.GREEN);   g2.draw(smallCC);
      	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
      	g2.setColor(Color.MAGENTA); g2.draw(shortFat);

      	BowlingBall bb1 = new BowlingBall(100,250,50,75);
      	g2.setColor(Color.CYAN); g2.draw(bb1);

      	// Make a black bowling ball that's half the size,
      	// and moved over 150 pixels in x direction
      	Shape bb2 = ShapeTransforms.scaledCopyOfLL(bb1,0.5,0.5);
      	bb2 = ShapeTransforms.translatedCopyOf(bb2,150,0);
      	g2.setColor(Color.BLACK); g2.draw(bb2);

      	// Here's a bowling ball that's 4x as big (2x the original)
      	// and moved over 150 more pixels to right.
      	bb2 = ShapeTransforms.scaledCopyOfLL(bb2,4,4);
      	bb2 = ShapeTransforms.translatedCopyOf(bb2,150,0);

      	// We'll draw this with a thicker stroke
      	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

      	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
      	// #002FA7 is "International Klein Blue" according to Wikipedia
      	// In HTML we use #, but in Java (and C/C++) its 0x

      	Stroke orig=g2.getStroke();
      	g2.setStroke(thick);
      	g2.setColor(new Color(0x8F00FF));
      	g2.draw(bb2);

      	// Draw two simple balls

      	Ball b1 = new Ball(50,350,40,75);
      	Ball b2 = new Ball(200,350,200,100);

      	g2.draw(b1);
      	g2.setColor(new Color(0x002FA7));

      	// Rotate the second ball 45 degrees around its center.
      	Shape b3 = ShapeTransforms.rotatedCopyOf(b2, Math.PI/4.0);

      	g2.draw(b3);

      	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

      	g2.setStroke(orig);
      	g2.setColor(Color.BLACK);
      	g2.drawString("A bunch of bowling balls and a few balls by Deren Lei", 20,20);
    }

    /** Draw a different picture with a few houses and coffee cups
     */

    public static void drawPicture3(Graphics2D g2) {

	      // label the drawing
        g2.drawString("A bunch of bowling balls by Deren Lei", 20,20);


      	// Draw some bowling balls.
        BowlingBall bb1 = new BowlingBall(205,50,40,150);

      	g2.setColor(new Color(0xA52A2A));
      	Shape s1 = ShapeTransforms.translatedCopyOf(bb1,250,-30);
      	s1 = ShapeTransforms.scaledCopyOf(s1,2.0,1);
      	s1 = ShapeTransforms.rotatedCopyOf(s1,0.15*Math.PI);
      	g2.draw(s1);

        g2.setColor(new Color(0x6841f4));
      	s1 = ShapeTransforms.translatedCopyOf(s1,0,220);
      	s1 = ShapeTransforms.rotatedCopyOf(s1,1.30*Math.PI);
      	g2.draw(s1);

        g2.setColor(new Color(0xFFFF2A));
        s1 = ShapeTransforms.translatedCopyOf(bb1,30,120);
        s1 = ShapeTransforms.rotatedCopyOf(s1,0.15*Math.PI);
        g2.draw(s1);

        g2.setColor(new Color(0x4179f4));
        s1 = ShapeTransforms.translatedCopyOf(s1,-20,50);
        s1 = ShapeTransforms.rotatedCopyOf(s1,1.70*Math.PI);
        g2.draw(s1);

        g2.setColor(new Color(0x41f464));
        s1 = ShapeTransforms.translatedCopyOf(s1,100,-220);
        s1 = ShapeTransforms.rotatedCopyOf(s1,0.45*Math.PI);
        g2.draw(s1);

    }
}
