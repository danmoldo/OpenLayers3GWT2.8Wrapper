package ol.layer;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Heatmap extends Vector {

    int getBlur();

    String[] getGradient();

    double getRadius();

    void setBlur(double blur);

    void setGradient(String[] colors);

    void setRadius(double radius);

}
