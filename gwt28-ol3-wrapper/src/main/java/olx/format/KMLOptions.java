package olx.format;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Collection;
import ol.style.Style;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface KMLOptions {

    @JsProperty
    void setExtractStyles(boolean extractStyles);

    @JsProperty
    void setShowPointNames(boolean showPointNames);

    @JsProperty
    void setDefaultStyle(Collection<Style> styles);

    @JsProperty
    void setWriteStyle(boolean writeStyle);

}
