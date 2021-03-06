package ol.interaction;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import ol.*;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Interaction extends ol.Object {

    @JsProperty
    boolean getActive();

    @JsProperty
    void setActive(boolean active);

}

