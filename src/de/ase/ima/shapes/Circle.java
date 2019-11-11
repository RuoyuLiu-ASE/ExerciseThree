package de.ase.ima.shapes;

import java.awt.*;

/**
 * @author: Alan
 * @create: 2019-11-06 16:33
 * @function:
 * @version:
 * @important value:
 */
public class Circle extends AbstractShape{
    public Circle(Point point, int radius, Color color,boolean filled){
        for(int i = 1; i<=360;i++) {
            // i is the number of lines
            int x = point.getX() + (int) (radius * Math.cos(Math.toRadians(i)));
            int y = point.getY() + (int) (radius * Math.sin(Math.toRadians(i)));
            addPoint(new Point(x,y));
        }
        setColor(color);
        setFilled(filled);
    }
}
