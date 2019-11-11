package de.ase.ima.shapes;

import java.awt.*;

/**
 * @author: Alan
 * @create: 2019-11-06 11:02
 * @function:
 * @version:
 * @important value:
 */
public class Triangle extends AbstractShape {
    public Triangle(Point p1, Point p2, Point p3, Color color, boolean filled){
        addPoint(p1);
        addPoint(p2);
        addPoint(p3);
        setColor(color);
        setFilled(filled);
    }
}
