package ol.layer;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Heatmap extends Vector {

    @JsProperty
    int getBlur();

    @JsProperty
    String[] getGradient();

    @JsProperty
    double getRadius();

    @JsProperty
    void setBlur(double blur);

    @JsProperty
    void setGradient(String[] colors);

    @JsProperty
    void setRadius(double radius);

}
