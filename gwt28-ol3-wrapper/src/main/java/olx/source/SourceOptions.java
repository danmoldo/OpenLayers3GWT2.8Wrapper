package olx.source;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import ol.Attribution;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface SourceOptions {

    @JsMethod
    void setAttributions (Attribution[] attributions);
    
}
