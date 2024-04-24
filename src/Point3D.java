// answer - implement this bla bla class
public class Point3D extends Point2D {
    private int z;

    public Point3D(int z) {
        super(0, 0); // sanırım doğru
        this.z = z;
    }

    public String toString() {
        return "x= " + x + " y= " + super.y + "z= " + z; // doesn't matter, super. or not
    }

    public void moveTo(int deltaX, int deltaY, int deltaZ) {
        super.moveTo(1, 1); // important
        z += deltaZ;
    }

    public double distanceFromToPoint() {
        return Math.sqrt(x * x + y * y + z * z);
    }
}