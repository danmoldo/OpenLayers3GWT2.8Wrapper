package ol.layer;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import ol.style.Style;
import ol.style.StyleFunction;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Vector extends Layer {

    ol.source.Vector getSource();

    Style getStyle();

    StyleFunction getStyleFunction();

    void setStyle (Style style);

    void setStyle (StyleFunction styleFunction);


}

