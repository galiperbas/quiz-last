//question
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

    public void moveTo(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

}
