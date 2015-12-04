package ol.control;

import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public abstract class ZoomToExtent implements Control {
    
    public static native ZoomToExtent getZoomToExtent();
    
}

