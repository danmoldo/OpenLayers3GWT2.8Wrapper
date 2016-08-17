package ol.geom;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Collection;
import ol.Coordinate;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface LineString extends SimpleGeometry {

    @JsProperty
    Collection<Coordinate> getCoordinates();

    @JsProperty
    void setCoordinates(Collection<Coordinate> coordinates);

}
