package ol;

import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType
public abstract class Attribution {
    
    public static native Attribution newInstance(AttributionOptions attributionOptions) /*-{
        return new $wnd.ol.Attribution(attributionOptions);
    }-*/;
    
    public abstract String getHTML();
    
}

