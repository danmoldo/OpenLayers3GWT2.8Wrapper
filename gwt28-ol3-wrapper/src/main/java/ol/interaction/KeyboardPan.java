package ol.interaction;

import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public abstract class KeyboardPan implements Interaction {

    public static native KeyboardPan getKeyboardPan();
    
}

