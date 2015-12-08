package ol.source;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Stamen extends Xyz {
    
    @JsMethod
    void setLayer(String layer);
    
}

