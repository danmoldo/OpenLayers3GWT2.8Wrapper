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
public interface SnapOptions {

    @JsProperty
    void setFeatures(Collection<Feature> features);

    @JsProperty
    void setEdge(boolean edge);

    @JsProperty
    void setVertex(boolean vertex);

    @JsProperty
    void setPixelTolerance(int pixelTolerance);

    @JsProperty
    void setSource(Vector source);
}