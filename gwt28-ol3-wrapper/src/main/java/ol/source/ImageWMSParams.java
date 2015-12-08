package ol.source;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface ImageWMSParams {

    @JsProperty
    void setLayers(String layers);
    
}

