package ol;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface MapBrowserEvent extends MapEvent {

    @JsProperty
    Coordinate getCoordinate();

}
