package olx;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Attribution;


/**
 * Options for {@link Attribution}.
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public abstract class AttributionOptions {

    public static native AttributionOptions getAttributionOptions();

    @JsProperty
    public String html;


}

