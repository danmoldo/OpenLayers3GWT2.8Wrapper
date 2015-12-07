package olx.source;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public interface StamenOptions {
    
    /**
     * 
     * @param layerName watercolor, toner
     */
    @JsProperty
    void setLayer(String layerName);
    
}

