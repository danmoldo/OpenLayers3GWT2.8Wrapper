package ol.interaction;

import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public abstract class DragAndDrop implements Interaction {
    
    public static native DragAndDrop getDragAndDrop();
    
}

