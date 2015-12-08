package olx.source;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import ol.tilegrid.TileGrid;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface TileDebugOptions {

    @JsProperty
    void setProjection(String projection);

    @JsProperty
    void setTileGrid(TileGrid tileGrid);

    @JsProperty
    void setWrapX(boolean wrapX);
    
}

