package ol.source;

import jsinterop.annotations.JsType;

import ol.tilegrid.TileGrid;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public interface Tile extends Source {
    
    TileGrid getTileGrid();
    
}

