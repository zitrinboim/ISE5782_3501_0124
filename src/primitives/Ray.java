package primitives;
/**
 * base class to rpresent ray by Point
 * and normal vector of the direction
 *
 */
    public class  Ray {
    private Point p0;
    private Vector dir;

    /**
     * constructor
     *
     * @param p the point
     * @param v the direction vector
     */
    public Ray(Point p, Vector v) {
        /*check if the vector is normelized*/
        if (!(v.length() == 1))
            v = v.normalize();
        p0 = p;
        dir = v;
    }

    /**
     * getter
     *
     * @return the p0
     */
    public Point getP0() {
        return p0;
    }

    /**
     * getter
     *
     * @return the vector of the direction
     */
    public Vector getDir() {
        return dir;
    }

    @Override
    public String toString() {
        return "Ray [p0=" + p0 + ", dir=" + dir + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Ray)) return false;
        Ray other = (Ray) obj;
        return p0.equals(other.p0) && dir.equals(other.dir);
    }

}