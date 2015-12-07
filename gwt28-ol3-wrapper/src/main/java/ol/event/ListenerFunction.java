package ol.event;

import com.google.gwt.user.client.*;
import jsinterop.annotations.JsFunction;
import ol.MapBrowserEvent;

/**
 * @author Dan Moldovan
 */

@FunctionalInterface
@JsFunction
public interface ListenerFunction {

    public void exec(MapBrowserEvent event);
}
