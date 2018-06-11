package olx.control;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Mihai Stanciu
 */
@JsType(isNative = true)
public interface FullScreenOptions {

    @JsProperty
    void setTipLabel(String tipLabel);
}
