package olx.layer;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Extent;
import ol.Map;
import ol.source.*;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface TileOptions {

    @JsProperty
    void setOpacity(double opacity);

    @JsProperty
    void setPreload(int preload);

    @JsProperty
    void setSource(ol.source.Tile source);

    @JsProperty
    void setMap(Map map);

    @JsProperty
    void setVisible(boolean visible);

    @JsProperty
    void setExtent(Extent extent);

    @JsProperty
    void setMinResolution(int minResolution);

    @JsProperty
    void setMaxResolution(int maxResolution);

    @JsProperty
    void setUseInterimTilesOnError(boolean useInterimTilesOnError);

}
