package olx.style;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.style.Fill;
import ol.style.Stroke;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface TextOptions {

    @JsProperty
    void setFont(String font);

    @JsProperty
    void setOffsetX(int offsetX);

    @JsProperty
    void setOffsetY(int offsetY);

    @JsProperty
    void setScale(int scale);

    @JsProperty
    void setRotation(int rotation);

    @JsProperty
    void setText(String text);

    @JsProperty
    void setTextAlign(String textAlign);

    @JsProperty
    void setTextBaseline(String textBaseline);

    @JsProperty
    void setFill(Fill fill);

    @JsProperty
    void setStroke(Stroke storke);
    
}

