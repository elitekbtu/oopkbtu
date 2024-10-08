package practice4;

import java.util.Vector;

public class ShapeTester {

    public static void main(String[] args) {
        Vector<Shape> shapes = new Vector<>();
        shapes.add(new Triangle(Shape.Color.BLACK, 2));
        shapes.add(new Circle(Shape.Color.RED, 2, 2));
        shapes.add(new Rectangle(Shape.Color.RED, 1, 5, 3));


        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                r.draw(2);
            } else if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                c.draw(2);
            } else if (shape instanceof Triangle) {
                Triangle t = (Triangle) shape;
                t.draw(3);
            }
        }
    }
}