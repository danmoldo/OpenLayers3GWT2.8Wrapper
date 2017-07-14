package ol.style;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * 
 * @author Dan Moldovan
 *
 */

@JsType(isNative = true)
public interface Style {

    @JsMethod
    Fill getFill();

    @JsMethod
    void setFill(Fill fill);

    @JsMethod
    Image getImage();

    @JsMethod
    void setImage(Image image);

    @JsMethod
    Stroke getStroke();

    @JsMethod
    void setStroke(Stroke stroke);

    @JsMethod
    Text getText();

    @JsMethod
    void setText(Text text);
}

