package ol.source;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public interface ImageWMSParams {
    
    /**
     * 
     * @param layers comma seperated layernames
     */
    @JsProperty
    void setLayers(String layers);
    
}

