package olx.source;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.source.ImageWMSParams;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface ImageWMSOptions {

    @JsProperty
    void setParams(ImageWMSParams imageWMSParams);

    @JsProperty
    void setRatio(float ratio); 

    @JsProperty
    void setUrl(String url); 
    
}

