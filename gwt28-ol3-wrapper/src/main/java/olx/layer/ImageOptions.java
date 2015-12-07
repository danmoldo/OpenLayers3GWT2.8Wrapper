package olx.layer;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Extent;
import ol.Map;
import ol.source.*;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface ImageOptions {

    @JsProperty
    void setOpacity(double opacity);

    @JsProperty
    void setSource(ol.source.Image source);

    @JsProperty
    void setMap(Map map);

    @JsProperty
    void setVisible(boolean visible);

    @JsProperty
    void setExtent(Extent extent);

    @JsProperty
    void setMinResolution(int minResolution);

    @JsProperty
    void setMaxResolution(int maxResolution);

}
