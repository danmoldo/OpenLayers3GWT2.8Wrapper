package ol;

import goog.events.Key;
import jsinterop.annotations.JsType;

import ol.event.ListenerFunction;


/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Observable {
    
    Key on(String type, ListenerFunction eventListener);

    Key once(String type, ListenerFunction eventListener);

    void un(String type, ListenerFunction eventListener);

    void unByKey(Key key);

}

