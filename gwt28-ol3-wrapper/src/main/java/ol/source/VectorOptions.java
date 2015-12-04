package ol.source;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Attribution;
import ol.Feature;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface VectorOptions {

    @JsProperty
    void setAttributions(Attribution[] attributions);

    @JsProperty
    void setFeatures(Feature[] features);

    @JsProperty
    void setUrl(String url);

    @JsProperty
    void setFormat(ol.format.Feature format);

}
