package ol.style;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * 
 * @author Dan Moldovan
 *
 */
@JsType(isNative = true)
public interface Text {

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

    @JsProperty
    String getFont();

    @JsProperty
    int getOffsetX();

    @JsProperty
    int getOffsetY();

    @JsProperty
    int getScale();

    @JsProperty
    int getRotation();

    @JsProperty
    String getText();

    @JsProperty
    String getTextAlign();

    @JsProperty
    String getTextBaseline();

    @JsProperty
    Fill getFill();

    @JsProperty
    Stroke getStroke();


    
}

