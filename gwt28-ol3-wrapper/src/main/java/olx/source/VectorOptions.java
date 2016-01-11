package olx.source;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Attribution;
import ol.Collection;
import ol.Feature;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface VectorOptions {

    @JsProperty
    void setAttributions(Attribution[] attributions);

    @JsProperty
    void setFeatures(Object features);

    @JsProperty
    void setUrl(String url);

    @JsProperty
    void setFormat(ol.format.Feature format);

}
