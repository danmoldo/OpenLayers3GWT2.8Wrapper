package ol.layer;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Collection;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Group extends Base {

    Collection<Base> getLayers();

    void setLayers(Collection<Base> layers);

}
