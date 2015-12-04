package ol.source;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface BingMapsOptions {

    @JsProperty
    void setCulture(String culture);

    @JsProperty
    void setKey(String key);

    @JsProperty
    void setImagerySet(String imagerySet);

}
