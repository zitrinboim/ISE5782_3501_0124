package primitives;

public class Vector extends Point {
    public Vector(double x, double y, double z) {

        this(new Double3(x, y, z));
    }

    /**
     * @param xyz
     */
    public Vector(Double3 xyz) {
        super(xyz);
        if (xyz.equals(Double3.ZERO)) {
            throw new IllegalArgumentException("Vector(0,0,0) is not allowed");
        }
    }

    /**
     * subtract between this vector and another one
     * @param other  the second vector
     * @return new vector from this vector to the other vector
     */
    public Vector subtract(Vector other) {
        return new Vector(xyz.subtract(other.xyz));
    }

    /**
     * @return
     */
    public double lengthSquared() {
        return xyz.d1 * xyz.d1 +
                xyz.d2 * xyz.d2 +
                xyz.d3 * xyz.d3;
    }

    public double length() {
        return Math.sqrt(lengthSquared());
    }

    /**
     * dot product between two vectors (scalar product)
     *
     * @param v3
     * @return "link https://www.mathsisfun.com/algebra/vectors-dot-product.html
     */
    public double dotProduct(Vector v3) {
        return v3.xyz.d1 * xyz.d1 +
                v3.xyz.d2 * xyz.d2 +
                v3.xyz.d3 * xyz.d3;
    }

    /**
     * cross product between two vectors (vectorial product)969
     *
     * @param v3
     * @return the vector result from the cross product( Right-hand rule)
     * @link: https://www.mathsisfun.com/algebra/vectors-cross-product.html
     */
    public Vector crossProduct(Vector v3) {
        double ax = xyz.d1;
        double ay = xyz.d2;
        double az = xyz.d3;

        double bx = v3.xyz.d1;
        double by = v3.xyz.d2;
        double bz = v3.xyz.d3;

        double cx = ay * bz - az * by;
        double cy = az * bx - ax * bz;
        double cz = ax * by - ay * bx;

        return new Vector(cx, cy, cz);
    }

    /**
     * @return
     */
    public Vector normalize() {
        double len = length();
        if (len == 0)
            throw new ArithmeticException("Divide by zero!");
        return new Vector(xyz.reduce((len)));
    }

    public Vector scale(double scalar) {
        return new Vector(xyz.scale(scalar));
    }
}