package ol.interaction;

import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public abstract class Modify implements Pointer {

    public static native Modify newInstance() /*-{
        return new $wnd.ol.interaction.Modify();
    }-*/;
    
}

