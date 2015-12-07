package olx;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import ol.proj.Projection;

/**
 * Options for creating a {@link ol.View}.
 * 
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface ViewOptions {

    @JsProperty
    void setCenter(double[] center);

    @JsProperty
    void setMaxResolution(double maxResolution);

    @JsProperty
    void setMinResolution(double minResolution);

    @JsProperty
    void setMaxZoom(double maxZoom);

    @JsProperty
    void setMinZoom(double minZoom);

    @JsProperty
    void setProjection(Projection projection);

    @JsProperty
    void setResolution(double resolution);

    @JsProperty
    void setResolutions(double[] resolutions);

    @JsProperty
    void setRotation(double rotation);

    @JsProperty
    void setZoom(double zoom);

    @JsProperty
    void setZoomFactor(double zoom);

}
