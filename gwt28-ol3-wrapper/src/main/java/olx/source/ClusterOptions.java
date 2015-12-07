package olx.source;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Attribution;
import ol.Extent;
import ol.format.Feature;
import ol.proj.Projection;
import ol.source.Vector;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface ClusterOptions {

    @JsProperty
    void setAttributions(Attribution[] attributions);

    @JsProperty
    void setDistance(Double distance);

    @JsProperty
    void setExtent(Extent extent);

    @JsProperty
    void setFormat(Feature featureFormat);

    @JsProperty
    void setLogo(String logo);

    @JsProperty
    void setProjection(Projection projection);

    @JsProperty
    void setSource(Vector vector);

    @JsProperty
    void setWrapX(boolean wrapX);

}
