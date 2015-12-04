package ol;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.EventTarget;
import com.google.gwt.user.client.EventListener;
import goog.events.Key;
import jsinterop.annotations.JsType;

import ol.event.Event;
import ol.event.ListenerFunction;


/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public interface Observable {
    
    Key on(String type, ListenerFunction eventListener);
    
    <T extends Event> void once(String type , EventListener eventListener);
    
    <T extends Event> void un(String type , EventListener eventListener);
    
}

