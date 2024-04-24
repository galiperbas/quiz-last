//question
/* create a class  for representing points in 3 dimensinoal space by subclassing the Point2D class. Implement the move
and toString and distanceSquareFromOrigin methods for the new class. Reuse the super classs members. */

public class Point2D {
    protected int x;
    protected int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x= " + x + " y= " + y;
    }

    public void move(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

}
