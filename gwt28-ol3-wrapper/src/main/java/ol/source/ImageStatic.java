package ol.source;

import jsinterop.annotations.JsType;

import ol.control.Attribution;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public interface ImageStatic extends Image {
    
    void setAttributions (Attribution[] attributions);
            
}

