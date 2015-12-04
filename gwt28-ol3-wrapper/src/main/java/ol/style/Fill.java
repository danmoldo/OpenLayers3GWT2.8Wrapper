package ol.style;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * 
 * @author Dan Moldovan
 *
 */
@JsType(isNative = true)
public interface Fill {

    @JsProperty
    String getColor();

    @JsProperty
    void setColor(String color);

}

