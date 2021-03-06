package olx.interaction;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Collection;
import ol.Feature;
import ol.source.Vector;
import ol.style.Style;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface DrawOptions {

    @JsProperty
    void setFeatures(Collection<Feature> features);

    @JsProperty
    void setSource(Vector source);

    @JsProperty
    void setType(String geometryType);

    @JsProperty
    void setStyle(Style style);
}
