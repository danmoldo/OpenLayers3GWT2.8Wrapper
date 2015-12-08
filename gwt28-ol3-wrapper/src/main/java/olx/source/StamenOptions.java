package olx.source;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface StamenOptions {

    @JsProperty
    void setLayer(String layerName);
    
}

