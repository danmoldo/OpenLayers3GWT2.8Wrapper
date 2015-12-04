package ol.source;

import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public interface Xyz extends TileImage {
    
    void setUrl(String url);
    
}

