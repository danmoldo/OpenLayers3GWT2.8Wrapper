package ol.control;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Attribution extends Control {

    @JsProperty
    void setCollapsed(boolean collapsed);

    @JsProperty
    void setCollapsible(boolean collapsible);
    
}

