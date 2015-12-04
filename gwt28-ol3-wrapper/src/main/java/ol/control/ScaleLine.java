package ol.control;

import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public abstract class ScaleLine implements Control {
    
    public static native ScaleLine getScaleLine();
    
}

