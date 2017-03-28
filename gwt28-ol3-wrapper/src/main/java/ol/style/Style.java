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
    Text getText();

    @JsMethod
    void setText(Text text);

    @JsMethod
    Fill getFill();
}

