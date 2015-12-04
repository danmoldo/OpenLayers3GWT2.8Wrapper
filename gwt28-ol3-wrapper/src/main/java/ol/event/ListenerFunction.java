package ol.event;

import com.google.gwt.user.client.*;
import jsinterop.annotations.JsFunction;
import ol.MapBrowserEvent;

/**
 * Created by DanMo on 26.11.2015.
 */

@FunctionalInterface
@JsFunction
public interface ListenerFunction {

    public void exec(MapBrowserEvent event);
}
