package olx.layer;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import ol.Extent;
import ol.source.Source;

/**
 * 
 * @author Dan Moldovan
 *
 */
@JsType(isNative = true)
public interface LayerOptions {

    @JsProperty
    void setOpacity(double opacity);

    @JsProperty
    void setSource(Source source);

    @JsProperty
    void setVisible(boolean visible);

    @JsProperty
    void setExtent(Extent extent);

    @JsProperty
    void setMinResolution(int minResolution);

    @JsProperty
    void setMaxResolution(int maxResolution);

}

