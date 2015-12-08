package olx.source;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface XyzOptions extends SourceOptions {

    @JsMethod
    void setUrl(String url);
    
}

