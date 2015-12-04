package ol.control;

import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public abstract class FullScreen implements Control {
    
    public static native FullScreen getFullScreen();
    
}

