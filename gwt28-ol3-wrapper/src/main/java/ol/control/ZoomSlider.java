package ol.control;

import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public abstract class ZoomSlider implements Control {
    
    public static native ZoomSlider getZoomSlider();
    
}

