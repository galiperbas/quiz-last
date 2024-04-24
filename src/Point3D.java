// answer - implement this bla bla class
public class Point3D extends Point2D {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + "z= " + z;
    }

    public void move(int deltaX, int deltaY, int deltaZ) {
        super.move(deltaX, deltaY); // Reuse move method from superclass
        z += deltaZ;
    }

    public double distanceSquareFromOrigin() {
        return Math.sqrt(super.distanceFromOrigin() + z * z);
    }
}