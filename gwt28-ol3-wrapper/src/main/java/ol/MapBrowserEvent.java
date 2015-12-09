package ol;

import com.google.gwt.user.client.Event;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface MapBrowserEvent extends MapEvent {

    @JsProperty
    Coordinate getCoordinate();

    @JsProperty
    Event getOriginalEvent();

}
