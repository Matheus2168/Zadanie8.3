package pl.ShapesTree;

public class Line2D extends Shape2D {

    private int p1x;
    private int p1y;
    private int p2x;
    private int p2y;


    public Line2D(int p1x, int p1y, int p2x, int p2y) {
        this.p1x = p1x;
        this.p1y = p1y;
        this.p2x = p2x;
        this.p2y = p2y;
    }

    public int getP1x() {
        return p1x;
    }

    public void setP1x(int p1x) {
        this.p1x = p1x;
    }

    public int getP1y() {
        return p1y;
    }

    public void setP1y(int p1y) {
        this.p1y = p1y;
    }

    public int getP2x() {
        return p2x;
    }

    public void setP2x(int p2x) {
        this.p2x = p2x;
    }

    public int getP2y() {
        return p2y;
    }

    public void setP2y(int p2y) {
        this.p2y = p2y;
    }
}
