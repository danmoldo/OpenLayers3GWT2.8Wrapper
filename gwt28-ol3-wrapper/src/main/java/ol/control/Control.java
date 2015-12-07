package ol.control;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import ol.Map;
import ol.Object;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Control extends Object {

    @JsProperty
    Map getMap();

    @JsProperty
    void setMap(Map map);
    
}

