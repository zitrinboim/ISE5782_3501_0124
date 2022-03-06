package geometries;

import primitives.*;

/**
 * Triangle class represents two-dimensional Triangle in 3D Cartesian coordinate
 * system heir from the polygon
 * @author Asher Mentzer & Mendy Kahana
 *
 */
public class Triangle extends Polygon {

    /**
     * constructor that get 3 points and use the polygon constructor
     * @param vertices
     */
    public Triangle(Point... vertices) {
        super(vertices);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Triangle [vertices=" + vertices + ", plane=" + plane + "]";
    }


}