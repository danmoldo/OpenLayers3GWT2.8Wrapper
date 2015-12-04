package ol.control;

import jsinterop.annotations.JsType;

import ol.Map;
import ol.Object;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public interface Control extends Object {
    
    Map getMap();

    void setMap(Map map);
    
}

