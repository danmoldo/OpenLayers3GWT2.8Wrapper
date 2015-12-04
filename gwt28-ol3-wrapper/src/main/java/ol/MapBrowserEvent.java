package ol;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Created by DanMo on 25.11.2015.
 */
@JsType(isNative = true)
public interface MapBrowserEvent extends MapEvent {

    @JsProperty
    Coordinate getCoordinate();

}
