package olx.source;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import ol.Attribution;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface SourceOptions {

    @JsProperty
    void setAttributions (Attribution[] attributions);
    
}
