package ol.geom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import ol.Coordinate;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface SimpleGeometry extends Geometry {

    @JsMethod
    Coordinate getFirstCoordinate();

    @JsMethod
    Coordinate getLastCoordinate();

    @JsMethod
    String getLayout();

    @JsMethod
    void translate(double deltaX, double deltaY);

}
