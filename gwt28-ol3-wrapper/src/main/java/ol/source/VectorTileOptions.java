package ol.source;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Attribution;
import ol.format.Feature;
import ol.proj.Projection;
import ol.tilegrid.TileGrid;
import ol.tilegrid.TileLoadFunctionType;
import ol.tilegrid.TileUrlFunctionType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface VectorTileOptions {

    @JsProperty
    void setAttributions(Attribution[] attributions);

    @JsProperty
    void setFormat(Feature feature);

    @JsProperty
    void setLogo(String logo);

    @JsProperty
    void setOpaque(boolean opaque);

    @JsProperty
    void setProjection(Projection projection);

    @JsProperty
    void setState(String state);

    //TODO tileClass

    @JsProperty
    void setTileGrid(TileGrid tileGrid);

    @JsProperty
    void setTileLoadFunction(TileLoadFunctionType tileLoadFunction);

    @JsProperty
    void setPixelRatio(int pixelRatio);

    @JsProperty
    void setTileUrlFunction(TileUrlFunctionType tileUrlFunction);

    @JsProperty
    void setUrl(String url);

    @JsProperty
    void setUrls(String[] urls);

    @JsProperty
    void setWrapX(boolean wrapX);

}
