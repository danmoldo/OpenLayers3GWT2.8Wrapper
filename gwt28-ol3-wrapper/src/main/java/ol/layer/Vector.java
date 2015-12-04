package ol.layer;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import ol.style.Style;
import ol.style.StyleFunction;

/**
 * 
 * @author Dan Moldovan
 *
 */
@JsType(isNative = true)
public interface Vector extends Layer {

    @JsMethod
    ol.source.Vector getSource();

    @JsMethod
    Style getStyle();

    @JsMethod
    StyleFunction getStyleFunction();

    @JsMethod
    void setStyle (Style style);

    @JsMethod
    void setStyle (StyleFunction styleFunction);


}

