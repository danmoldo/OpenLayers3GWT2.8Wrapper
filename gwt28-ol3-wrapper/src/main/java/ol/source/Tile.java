package ol.source;

import jsinterop.annotations.JsType;

import ol.tilegrid.TileGrid;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Tile extends Source {
    
    TileGrid getTileGrid();
    
}

