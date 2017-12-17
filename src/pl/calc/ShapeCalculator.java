package pl.calc;

import pl.ShapesTree.Ball;
import pl.ShapesTree.Circle;
import pl.ShapesTree.Cube;
import pl.ShapesTree.Rectangle;

public class ShapeCalculator extends LineCalculator implements Calc2D,Calc3D{


    @Override
    public double circleArea(Circle circle) {
        return Math.PI*Math.pow(circle.getR(),2);
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        double p = (rectangle.getA()+rectangle.getB()+rectangle.getC())/2;
        return Math.sqrt(p*(  p-rectangle.getA()  )*(  p-rectangle.getB()  )*(  p-rectangle.getC()  ));
    }

    @Override
    public double ballVolume(Ball ball) {
        return 4/3*Math.PI*Math.pow(ball.getR(),3);
    }

    @Override
    public double cubeVolume(Cube cube) {
        return cube.getA()*cube.getB()*cube.getC();
    }
}
