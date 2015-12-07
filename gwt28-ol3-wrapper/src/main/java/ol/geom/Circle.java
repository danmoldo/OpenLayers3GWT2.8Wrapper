package ol.geom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Coordinate;
import ol.Extent;
import ol.proj.Projection;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Circle extends SimpleGeometry {

    @JsMethod
    Circle clone();

    @JsProperty
    Coordinate getCenter();

    @JsProperty
    double getRadius();

    @JsMethod
    String getType();

    @JsMethod
    boolean intersectsExtent(Extent extent);

    @JsProperty
    void setCenter(Coordinate center);

    @JsMethod
    void setCenterAndRadius(Coordinate center, double radius, String layout);

    @JsProperty
    void setRadius(double radius);

    @JsMethod
    Circle transform(Projection source, Projection destination);

}
