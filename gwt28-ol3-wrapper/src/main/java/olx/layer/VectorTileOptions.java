package olx.layer;

import com.google.gwt.thirdparty.javascript.rhino.head.Function;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Extent;
import ol.Map;
import ol.source.*;
import ol.style.Style;
import ol.style.StyleFunction;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface VectorTileOptions {

    @JsProperty
    void setRenderBuffer(int renderBuffer);

    @JsProperty
    void setRenderOrder(Function renderOrder);

    @JsProperty
    void setMap(Map map);

    @JsProperty
    void setExtent(Extent extent);

    @JsProperty
    void setMinResolution(int minResolution);

    @JsProperty
    void setMaxResolution(int maxResolution);

    @JsProperty
    void setOpacity(double opacity);

    @JsProperty
    void setSource(ol.source.VectorTile vectorTile);

    @JsProperty
    void setStyle(Style style);

    @JsProperty
    void setStyle(StyleFunction styleFunction);

    @JsProperty
    void setUpdateWhileAnimating(boolean updateWhileAnimating);

    @JsProperty
    void setUpdateWhileInteracting(boolean updateWhileInteracting);

    @JsProperty
    void setVisible(boolean visible);

}
