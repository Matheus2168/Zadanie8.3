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
        System.out.println(shapeCalculator.circleArea(circle));

        Rectangle rectangle = new Rectangle(5,6,7);
        System.out.println(shapeCalculator.rectangleArea(rectangle));

        Ball ball = new Ball(10);
        System.out.println(shapeCalculator.ballVolume(ball));

        Cube cube = new Cube(5,10,15);
        System.out.println(shapeCalculator.cubeVolume(cube));
    }
}
