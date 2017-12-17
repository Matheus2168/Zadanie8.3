package pl.pl.test;

import pl.ShapesTree.*;
import pl.calc.LineCalculator;
import pl.calc.ShapeCalculator;

public class Test {


    public static void main(String[] args) {

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        Line2D line = new Line2D(-1,5,10,10);
        System.out.println(shapeCalculator.lineLength(line));

        Circle circle = new Circle(5);
        System.out.println(shapeCalculator.shapeArea(circle));

        Rectangle rectangle = new Rectangle(5,6);
        System.out.println(shapeCalculator.shapeArea(rectangle));

        Ball ball = new Ball(10);
        System.out.println(shapeCalculator.volume(ball));

        Cube cube = new Cube(5);
        System.out.println(shapeCalculator.volume(cube));

        Shape[] shapes = new Shape[5];
        shapes[0] = line;
        shapes[1] = circle;
        shapes[2] = rectangle;
        shapes[3] = ball;
        shapes[4] = cube;

        for (Shape shape : shapes) {
            shapeCalculator.calculateAndShowPossibleValues(shape);
        }



    }
}
