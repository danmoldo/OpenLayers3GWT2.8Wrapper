package olx.layer;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Extent;
import ol.source.*;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface HeatmapOptions {

    @JsProperty
    void setGradient(String[] colors);

    @JsProperty
    void setRadius(double radius);

    @JsProperty
    void setBlur(double blur);

    @JsProperty
    void setShadow(double shadow);

    @JsProperty
    void setWeight(String weight);

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
    void setVisible(boolean visible);

}
