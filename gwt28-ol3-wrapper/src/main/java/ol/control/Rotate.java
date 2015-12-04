package ol.control;

import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public abstract class Rotate implements Control {
    
    public static native Rotate getRotate();
    
}

