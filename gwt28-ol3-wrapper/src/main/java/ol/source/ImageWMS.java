package ol.source;

import jsinterop.annotations.JsType;

/**
 * 
 * @author Dan Moldovan
 *
 */
@JsType(isNative = true)
public interface ImageWMS extends Image {

    String getUrl();
    
    void setUrl(String url); 
    
}

