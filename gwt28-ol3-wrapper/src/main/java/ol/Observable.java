package ol;

import goog.events.Key;
import jsinterop.annotations.JsType;

import ol.event.ListenerFunction;


/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public interface Observable {
    
    Key on(String type, ListenerFunction eventListener);
    
}

