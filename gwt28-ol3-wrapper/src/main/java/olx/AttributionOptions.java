package olx;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Attribution;


/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface AttributionOptions {

    AttributionOptions getAttributionOptions();

    @JsProperty
    String getHtml();

    @JsProperty
    void setHtml(String html);


}

