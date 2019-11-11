package de.ase.ima.shapes;

import de.ase.ima.shapes.AbstractShape;
import de.ase.ima.shapes.Point;

import java.awt.*;

/**
 * @author: Alan
 * @create: 2019-11-05 17:06
 * @function:
 * @version:
 * @important value:
 */
public class Rectangle extends AbstractShape{
    public Rectangle(Point lowerLeft, Point upperRight,Color color, boolean filled) {
        addPoint(lowerLeft);
        addPoint(new Point(lowerLeft.getX(),upperRight.getY()));
        addPoint(upperRight);
        addPoint(new Point(upperRight.getX(),lowerLeft.getY()));
        setColor(color);
        setFilled(filled);
    }
    public Rectangle(int x1, int y1, int x2, int y2, Color color, boolean filled){
        addPoint(new Point(x1,y1));
        addPoint(new Point(x1,y2));
        addPoint(new Point(x2,y2));
        addPoint(new Point(x2,y1));
        setColor(color);
        setFilled(filled);
    }
}
