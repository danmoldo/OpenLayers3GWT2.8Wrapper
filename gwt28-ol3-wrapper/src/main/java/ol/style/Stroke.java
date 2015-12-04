package ol.style;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Stroke {

    @JsProperty
    String getColor();

    @JsProperty
    String getLineCap();

    @JsProperty
    String getLineJoin();

    @JsProperty
    double[] getLineDash();

    @JsProperty
    double getMiterLimit();

    @JsProperty
    int getWidth();

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

