package de.ase.ima.shapes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractShape implements Shape {

	private List<Point> points;

	private Color color;

	private boolean filled;

	/**
	 * Standard constructor for shape
	 */
	public AbstractShape() {
		points = new ArrayList<>();

		// set default color
		setColor(Color.BLACK);
	}

	/**
	 * Constructor to create a new shape and to initialize instance variables
	 *
	 * @param color  color of shape
	 * @param filled is shape filled
	 */
	public AbstractShape(Color color, boolean filled) {
		this();
		setColor(color);
		setFilled(filled);
	}

	/**
	 * Adds a new point to the shape.
	 *
	 * @param point the point that has to be added
	 */
	protected void addPoint(Point point) {
		points.add(point);
	}

	/**
	 * @return line and fill color of shape
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Sets the line and fill color of shape
	 *
	 * @param color the used color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @return true if the shape is filled
	 */
	public boolean isFilled() {
		return filled;
	}

	/**
	 * Change value of filled
	 *
	 * @param filled new value of filled
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/**
	 * @return list of points of the shape
	 */
	public List<Point> getPoints() {
		return points;
	}
// This is for Task 2 (e)
	public double calculatePerimeter(){
		double perimeter = 0;
		int numberOfPoints = getPoints().size();

		for(int i=0; i<(numberOfPoints-1);i++){
			// i is the index of points of the shape
			Point p1 = getPoints().get(i);
			perimeter += p1.distance(getPoints().get(i+1));
		}
		perimeter = perimeter + getPoints().get(numberOfPoints-1).distance(getPoints().get(0));
		return  perimeter;
	}
}

//	/**
//	 * Calculates the perimeter of the shape
//	 * by adding all the distances between consecutive pair of points
//	 *
//	 * @return length of the perimeter, 0 if the number of points is less than 3
//	 */
//	public double calculatePerimeter() {
//		double perimeter = 0;
//		if (points.size() > 2) {
//			Point first = null;
//			Point previous = null;
//			for (Point point : points) {
//				if (first == null) {
//					first = point;
//				} else {
//					perimeter += point.distance(previous);
//				}
//				previous = point;
//			}
//			perimeter += previous.distance(first);
//		}
//		return perimeter;
//	}
//}