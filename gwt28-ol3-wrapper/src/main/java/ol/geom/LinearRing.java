package ol.geom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Collection;
import ol.Coordinate;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface LinearRing extends SimpleGeometry {

    @JsMethod
    LinearRing clone();

    @JsMethod
    double getArea();

    @JsProperty
    Collection<Coordinate> getCoordinates();

    @JsMethod
    String getType();

    @JsProperty
    void setCoordinates(Collection<Coordinate> coordinates);

}
