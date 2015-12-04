package ol.style;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Image {

    @JsProperty
    double getOpacity();

    @JsProperty
    boolean getRotateWithView();

    @JsProperty
    double getRotation();

    @JsProperty
    double getScale();

    @JsProperty
    boolean getSnapToPixel();

    @JsProperty
    void setOpacity(double opacity);

    @JsProperty
    void setRotation(double rotation);

    @JsProperty
    void setScale(double scale);

}
