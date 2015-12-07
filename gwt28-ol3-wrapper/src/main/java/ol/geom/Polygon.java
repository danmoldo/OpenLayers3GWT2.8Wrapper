package ol.geom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import ol.Collection;
import ol.Coordinate;
import ol.Extent;
import ol.Sphere;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Polygon extends SimpleGeometry {

    @JsMethod
    Polygon circular(Sphere sphere, Coordinate coordinate, double radius, int numberOfVertices);

    @JsMethod
    Polygon fromCircle(Circle circle, int sides, int angle);

    @JsMethod
    Polygon fromExtent(Extent extent);

    @JsMethod
    void appendLinearRing(LinearRing linearRing);

    @JsMethod
    double getArea();

    @JsMethod
    Collection<Collection<Coordinate>> getCoordinates(boolean right);

    @JsMethod
    Point getInteriorPoint();

    @JsMethod
    LinearRing getLinearRing(int index);

    @JsMethod
    int getLinearRingCount();

    @JsMethod
    Collection<LinearRing> getLinearRings();

    @JsMethod
    String getType();

    @JsMethod
    boolean intersectsExtent(Extent extent);

    @JsMethod
    void setCoordinates(Coordinate coordinates, String layout);

}
