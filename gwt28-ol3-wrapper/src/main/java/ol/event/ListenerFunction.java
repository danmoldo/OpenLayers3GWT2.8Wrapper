package ol.event;

import com.google.gwt.user.client.*;
import goog.events.*;
import jsinterop.annotations.JsFunction;
import ol.MapBrowserEvent;

/**
 * @author Dan Moldovan
 */

@FunctionalInterface
@JsFunction
public interface ListenerFunction {

    public void exec(goog.events.Event event);
}
