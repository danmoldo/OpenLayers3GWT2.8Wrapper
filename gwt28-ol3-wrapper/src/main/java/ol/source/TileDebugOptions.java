package ol.source;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import ol.tilegrid.TileGrid;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public interface TileDebugOptions {
    
    /**
     * 
     * @param projection projection
     */
    @JsProperty
    void setProjection(String projection);
    
    /**
     * 
     * @param tileGrid tilegrid
     */
    @JsProperty
    void setTileGrid(TileGrid tileGrid);
    
    /**
     * 
     * @param wrapX
     */
    @JsProperty
    void setWrapX(boolean wrapX);
    
}

