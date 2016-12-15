package ol;

import jsinterop.annotations.JsFunction;
import ol.style.Style;

/**
 * Created by Dan Moldovan on 13.12.2016.
 */
@FunctionalInterface
@JsFunction
public interface EventsConditionType {

    public boolean exec(MapBrowserEvent mapBrowserEvent);

}
