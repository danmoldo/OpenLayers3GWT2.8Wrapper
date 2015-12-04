package ol.style;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 *
 */
@JsType(isNative = true)
public interface CircleOptions {

    @JsProperty
    void setFill(Fill fill);
    
    @JsProperty
    void setRadius(int radius);
    
    @JsProperty
    void setSnapToPixel(boolean snapToPixel);
    
    @JsProperty
    void setStroke(Stroke stroke);
    
}

