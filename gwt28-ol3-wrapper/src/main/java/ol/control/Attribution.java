package ol.control;

import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType()
public abstract class Attribution implements Control {

    public static native Attribution newInstance() /*-{
        return new $wnd.ol.control.Attribution();
    }-*/;

    public abstract void setCollapsed(boolean collapsed);
    
    public abstract void setCollapsible(boolean collapsible);
    
}

