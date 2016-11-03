package olx.source;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface MapQuestOptions {

    @JsProperty
    void setLayer(String layerName);

    @JsProperty
    void setUrl(String url);

}
