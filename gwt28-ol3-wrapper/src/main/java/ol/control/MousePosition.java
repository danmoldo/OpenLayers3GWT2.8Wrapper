package ol.control;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.proj.Projection;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface MousePosition extends Control {

    @JsProperty
    String getCoordinateFormat();

    @JsProperty
    Projection getProjection();

    @JsProperty
    void setCoordinateFormat(String coordinateFormat);

    @JsProperty
    void setProjection(Projection projection);

}

