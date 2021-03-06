package lighting;

import primitives.Color;
import primitives.Point;
import primitives.Vector;

public class DirectionalLight extends Light implements LightSource{
    /**
     * @param intensity
     */

    final Vector Direction;

    /**
     *
     * @param intensity
     * @param direction
     */
    protected DirectionalLight(Color intensity, Vector direction) {
        super(intensity);
        Direction = direction;
    }

    @Override
    public Color getIntensity(Point p) {
        return super.getIntensity();
    }

    public Vector getL(Point p)
    {
        return Direction;
        //TODO
    }
    @Override
    public double getDistance(Point p) {
        return Double.POSITIVE_INFINITY;
    }
}