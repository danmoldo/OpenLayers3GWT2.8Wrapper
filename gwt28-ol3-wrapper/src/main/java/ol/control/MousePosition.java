package ol.control;

import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public abstract class MousePosition implements Control {

    public static native MousePosition getMousePosition();
    
}

