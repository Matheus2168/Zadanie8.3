package pl.calc;

import pl.ShapesTree.*;

public class ShapeCalculator extends LineCalculator implements Calc2D,Calc3D{

    @Override
    public double shapeArea(GeometricShape shape) {
        double result = 0;
        if (shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle)shape;
            result = rectangle.getA()*rectangle.getB();
        }
        else if (shape instanceof Circle){
            Circle circle = (Circle) shape;
            result = Math.PI*Math.pow(circle.getR(),2);
        }
        return result;
    }



    @Override
    public double volume(Shape3D shape) {
        double result = 0;
        if (shape instanceof Ball){
            Ball ball = (Ball) shape;
            result = 4/3*Math.PI*Math.pow(ball.getR(),3);
        }
        else if (shape instanceof Cube){
            Cube cube = (Cube) shape;
            result = Math.pow(cube.getA(),3);
        }
        return result;
    }

    public void calculateAndShowPossibleValues(Shape shape){
        if (shape instanceof Line2D){
            Line2D line = (Line2D) shape;
            System.out.printf("Linia laczaca punkty[%d,%d][%d,%d] ma dlugosc %.2f%n",line.getP1x(),line.getP1y(),line.getP2x(),line.getP2y(),lineLength(line));
        }
        else if (shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            System.out.printf("Prostokat o bokach %d i %d ma pole %.2f%n",rectangle.getA(),rectangle.getB(),shapeArea(rectangle));
        }
        else if (shape instanceof Circle){
            Circle circle = (Circle) shape;
            System.out.printf("Okrag o promieniu %.2f ma pole %.2f%n",circle.getR(),shapeArea(circle));
        }
        else if (shape instanceof Ball){
            Ball ball = (Ball) shape;
            System.out.printf("Kula o promieniu %.2f ma objetosc %.2f%n",ball.getR(),volume(ball));
        }
        else if (shape instanceof Cube){
            Cube cube = (Cube) shape;
            System.out.printf("Szescian o dlugosci boku %d ma objetosc %.2f%n",cube.getA(),volume(cube));
        }
    }
}
