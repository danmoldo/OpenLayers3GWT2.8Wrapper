package ol.layer;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Extent;
import ol.style.Style;
import ol.style.StyleFunction;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface VectorOptions {

    @JsProperty
    void setExtent(Extent extent);

    @JsProperty
    void setMinResolution(int minResolution);

    @JsProperty
    void setMaxResolution(int maxResolution);

    @JsProperty
    void setOpacity(double opacity);

    @JsProperty
    void setSource(ol.source.Vector source);

    @JsProperty
    void setStyle(StyleFunction style);

    @JsProperty
    void setVisible(boolean visible);

}
