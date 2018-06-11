package olx.interaction;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Mihai Stanciu
 */
@JsType(isNative = true)
public interface MouseWheelZoomOptions {

    @JsProperty
    boolean getConstrainResolution();

    @JsProperty
    void setConstrainResolution(boolean active);

    @JsProperty
    int getTimeout();

    @JsProperty
    void setTimeout(int timeout);

    @JsProperty
    int getDuration();

    @JsProperty
    void setDuration(int duration);

}
