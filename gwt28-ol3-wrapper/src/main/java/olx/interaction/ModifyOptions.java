package olx.interaction;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Collection;
import ol.Feature;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface ModifyOptions {

    @JsProperty
    void setFeatures(Collection<Feature> features);

}
