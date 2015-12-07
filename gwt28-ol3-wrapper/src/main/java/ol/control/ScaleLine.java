package ol.control;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface ScaleLine extends Control {

    @JsProperty
    String getUnits();

    @JsProperty
    void setUnits(String units);

}

