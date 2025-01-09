import colors.Color;
import service.impl.ShapeServiceImpl;
import shapes.*;

import java.util.LinkedList;
import java.util.List;
public class Main{
    public static void main(String[] args) {
        Triangle redTri = new Triangle(new Point(0,0),new Point(4,0), new Point(0,4));
        redTri.setColor(Color.red);

        Circle whiteCircle = new Circle(new Point(3,3), 2);
        whiteCircle.setColor(Color.white);

        Circle yellowCircle = new Circle(new Point(2,5), 4);
        yellowCircle.setColor(Color.yellow);

        Rectangle rect = new Rectangle(new Point(1,1),new Point(5,2));

        Point point = new Point(100,100);

        Triangle blueTri = new Triangle(new Point(-2,3),new Point(4,3),new Point(2,5));
        blueTri.setColor(Color.blue);

        List<Shape> shapes = new LinkedList<Shape>();
        shapes.add(redTri);
        shapes.add(whiteCircle);
        shapes.add(yellowCircle);
        shapes.add(rect);
        shapes.add(point);
        shapes.add(blueTri);
        ShapeServiceImpl impl = new ShapeServiceImpl();
        System.out.println(impl.getSquares(shapes));
        System.out.println(impl.getMaxPerimeters(shapes));
        System.out.println(impl.getColors(shapes));
        Rectangle rect1 = new Rectangle(new Point(0,1), new Point(1,0));
        rect1.draw();
    }
}