package pl.calc;

import pl.ShapesTree.Line2D;

public class LineCalculator {

    public double lineLength(Line2D line){
        return Math.sqrt((Math.pow(line.getP1y()-line.getP1x(),2))+(Math.pow(line.getP2y()-line.getP2x(),2)));
    }
}
