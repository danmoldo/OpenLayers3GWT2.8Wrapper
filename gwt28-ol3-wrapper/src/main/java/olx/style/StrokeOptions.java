package olx.style;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface StrokeOptions {

    @JsProperty
    void setColor(String color);

    @JsProperty
    void setLineCap(String lineCap);

    @JsProperty
    void setLineJoin(String lineJoin);

    @JsProperty
    void setLineDash(double[] lineDash);

    @JsProperty
    void setMiterLimit(double miterLimit);

    @JsProperty
    void setWidth(int width);
    
}

