package ol.source;

import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public interface ImageWMS extends Image {
    
    String getUrl();
    
    void setUrl(String url); 
    
}

