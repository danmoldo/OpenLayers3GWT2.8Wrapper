package ol.proj;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import ol.Coordinate;
import ol.Extent;
import olx.proj.ProjectionOptions;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public class Projection {

    @JsMethod(name = "transformExtent", namespace = "ol.proj")
    public static native Extent transformExtent(Extent extent, Projection projectionFrom, Projection projectionTo);

}

