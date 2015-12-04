package ol.interaction;

import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public abstract class KeyboardZoom implements Interaction {

    public static native KeyboardZoom getKeyboardZoom();
   
}

