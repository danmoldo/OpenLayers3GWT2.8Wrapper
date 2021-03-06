package ol.geom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Coordinate;
import ol.Extent;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Point extends SimpleGeometry {

    @JsMethod
    Point clone();

    @JsProperty
    Coordinate getCoordinates();

    @JsMethod
    String getType();

    @JsMethod
    boolean intersectsExtent(Extent extent);

    @JsProperty
    void setCoordinates(Coordinate coordinates);

}
