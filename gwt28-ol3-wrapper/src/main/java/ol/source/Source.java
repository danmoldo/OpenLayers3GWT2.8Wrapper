package ol.source;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import ol.*;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Source extends ol.Object{

    @JsMethod
    String getState();

}

