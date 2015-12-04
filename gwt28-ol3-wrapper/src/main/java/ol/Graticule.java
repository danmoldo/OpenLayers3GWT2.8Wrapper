package ol;

import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public abstract class Graticule {
    
    public static native Graticule newInstance() /*-{
        return new $wnd.ol.Graticule();
    }-*/;
    
    public abstract void setMap(Map map);
    
}

