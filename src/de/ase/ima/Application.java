package de.ase.ima;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import de.ase.ima.shapes.*;
import de.ase.ima.shapes.Point;
import de.ase.ima.shapes.Rectangle;
import de.ase.ima.shapes.Shape;

public class Application {

	public static void main(String[] args) {
		
		// a list of shapes that have to be drawn
		List<Shape> shapes = new ArrayList<>();

/*     // Task One
		shapes.add(new Rectangle(100,100,300,300, Color.red,true));
		shapes.add(new Triangle(new Point(100,300),new Point(200,100),new Point(300,300),Color.yellow,true));
*/
		//Task Two
		Point blueUpperLeft = new Point(0,0);
		Point blueLowerRight = new Point(500,250);
		Point greenUpperLeft = new Point(0,250);
		Point greenLowerRight = new Point(500,500);

		Point redLowerLeft = new Point(blueLowerRight.getX()/3,blueLowerRight.getY()/3*2);
		Point redUpper = new Point(blueLowerRight.getX()/2,blueLowerRight.getY()/4);
		Point redLowerRight = new Point(blueLowerRight.getX()/3*2,blueLowerRight.getY()/3*2);

		Point yellowUpperLeft = redLowerLeft;
		Point yellowUpperRight = redLowerRight;
		Point yellowLowerLeft = new Point(redLowerLeft.getX(),redLowerLeft.getY()+160);

		Point blackLowerLeft = new Point(yellowUpperLeft.getX()+25,yellowUpperLeft.getY()+50);
		Point blackUpperRight = new Point(yellowUpperLeft.getX()+55,yellowUpperLeft.getY()+20);

		Point black2LowerLeft = new Point(yellowUpperRight.getX()-55,blackLowerLeft.getY());
		Point black2UpperRight = new Point(yellowUpperRight.getX()-25,blackUpperRight.getY());

		Point grayLowerLeft = new Point(blackUpperRight.getX()+5,yellowLowerLeft.getY());
		Point grayUpperRight = new Point(black2LowerLeft.getX()-5,yellowLowerLeft.getY()-60);

		Point blackCircleCenter = new Point((blackLowerLeft.getX()+blackUpperRight.getX())/2,(blackLowerLeft.getY()+blackUpperRight.getY())/2);
		Point black2CircleCenter = new Point((black2LowerLeft.getX()+black2UpperRight.getX())/2,(black2LowerLeft.getY()+black2UpperRight.getY())/2);

		Rectangle bigBlue = new Rectangle(blueUpperLeft,blueLowerRight,Color.blue,true);
		Rectangle bigGreen = new Rectangle(greenUpperLeft,greenLowerRight,Color.green,true);
		Triangle redTriangle = new Triangle(redLowerLeft,redUpper,redLowerRight,Color.red,true);
		Rectangle yellowRectangle = new Rectangle(yellowLowerLeft,yellowUpperRight,Color.yellow,true);
		Rectangle blackRectangle = new Rectangle(blackLowerLeft,blackUpperRight,Color.black,false);
		Rectangle black2Rectangle = new Rectangle(black2LowerLeft,black2UpperRight,Color.black,false);
		Rectangle grayRectangle = new Rectangle(grayLowerLeft,grayUpperRight,Color.gray,true);
		Circle blackCircle = new Circle(blackCircleCenter,25,Color.black,false);
		Circle blackCircle2 = new Circle(black2CircleCenter,25,Color.black,false);

		shapes.add(bigBlue);
		shapes.add(bigGreen);
		shapes.add(redTriangle);
		shapes.add(yellowRectangle);
		shapes.add(blackRectangle);
		// This is for Task 2.1
		shapes.add(black2Rectangle);
		shapes.add(grayRectangle);
		// This is for Task 2.2(c)
		shapes.add(blackCircle);
		shapes.add(blackCircle2);

		// create the frame and draw the shapes
		ShapeFrame frame = new ShapeFrame();
		frame.drawShapes(shapes);
		frame.setVisible(true);
	}

}
