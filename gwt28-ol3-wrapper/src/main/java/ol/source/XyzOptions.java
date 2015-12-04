package ol.source;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public interface XyzOptions extends SourceOptions {
    
    /**
     * 
     * @param url
     */
    @JsMethod
    void setUrl(String url);
    
}

