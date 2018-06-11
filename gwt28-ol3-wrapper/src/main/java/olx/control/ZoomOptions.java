package olx.control;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *  @author Mihai Stanciu
 */
@JsType(isNative = true)
public interface ZoomOptions {

    @JsProperty
    void setZoomInTipLabel(String zoomInTipLabel);

    @JsProperty
    void setZoomOutTipLabel(String zoomOutTipLabel);
}

