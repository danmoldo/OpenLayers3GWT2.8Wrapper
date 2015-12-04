package ol.style;
import jsinterop.annotations.*;
import ol.Feature;
import ol.OLFactory;
import ol.geom.Geometry;

/**
 * @author Dan Moldovan
 *
 */
@JsType(isNative = true)
public interface StyleOptions {

    @JsProperty
    void setGeometry(Geometry geometry);

    @JsProperty
    void setFill(Fill fill);

    @JsProperty
    void setImage(ol.style.Image image);
    
    @JsProperty
    void setStroke(Stroke stroke);

    @JsProperty
    void setText(ol.style.Text text);
    
    @JsProperty
    void setZIndex(int zIndex);

}

