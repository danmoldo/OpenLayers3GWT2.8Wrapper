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
public interface ImageWMSOptions {
    
    /**
     * 
     * @param imageWMSParams params for WMS-requests
     */
    @JsProperty
    void setParams(ImageWMSParams imageWMSParams);
    
    /**
     * 
     * @param ratio
     */
    @JsProperty
    void setRatio(float ratio); 
    
    /**
     * 
     * @param url WMS service URL
     */
    @JsProperty
    void setUrl(String url); 
    
}

