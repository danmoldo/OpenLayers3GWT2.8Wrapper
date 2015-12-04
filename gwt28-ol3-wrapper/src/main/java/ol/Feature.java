package ol;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import ol.geom.Geometry;
import ol.style.Style;
import ol.style.StyleFunction;

/**
 * 
 * @author Dan Moldovan
 *
 */
@JsType(isNative = true)
public interface Feature extends Object {

    @JsMethod
    Feature clone();

    @JsMethod
    Geometry getGeometry();

    @JsMethod
    String getGeometryName();

    @JsMethod
    String getId();

    @JsMethod
    Style getStyle();

    @JsMethod
    StyleFunction getStyleFunction();

    @JsMethod
    void setGeometry(Geometry geometry);

    @JsMethod
    void setGeometryName(String geometryName);

    @JsMethod
    void setId(String id);

    @JsMethod
    void setStyle(Style style);

    @JsMethod
    void setStyle(Style[] style);

    @JsMethod
    void setStyle(StyleFunction styleFunction);

}

