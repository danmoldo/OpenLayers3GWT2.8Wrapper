package ol.source;

import jsinterop.annotations.JsType;

import ol.control.Attribution;

/**
 * 
 * @author Dan Moldovan
 *
 */
@JsType(isNative = true)
public interface ImageStatic extends Image {
    
    void setAttributions (Attribution[] attributions);
            
}

