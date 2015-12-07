package ol.geom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import ol.*;
import ol.proj.Projection;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Geometry extends ol.Object {

    @JsMethod
    Coordinate getClosestPoint(Coordinate point);

    @JsMethod
    Extent getExtent();

    @JsMethod
    Geometry simplify(double tolerance);

    @JsMethod
    Geometry transform(Projection source, Projection destination);

}

