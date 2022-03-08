package geometries;

import primitives.Point;
import primitives.Ray;
import primitives.Vector;

/**
 * Cylinder class heir from the Tube class
 *
 */
public class Cylinder extends Tube implements Geometry {

    /**
     * the height of the cylinder
     */
    private double height;

    /**
     * constructor
     *
     * @param axisRay the Ray
     * @param radius  the radius
     * @param height  the height
     */
    public Cylinder(Ray axisRay, double radius, double height) {
        super(axisRay, radius);
        this.height = height;
    }

    /**
     * getter
     *
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Cylinder [height=" + height + ", axisRay=" + axisRay + ", radius=" + radius + "]";
    }

    /**
     * The normal of the cylinder
     *
     * @param point
     * @return The normal of the cylinder
     */
    public Vector getNormal(Point point) {
        Vector v = point.subtract(axisRay.getP0());

        double t = axisRay.getDir().dotProduct(v);
        if (t == 0 || t == height || t == -height)//the point are on the bases
            return axisRay.getDir().normalize();

        Point O = axisRay.getP0().add(axisRay.getDir().scale(t));
        return point.subtract(O).normalize();
    }

}