package ol.tilegrid;

import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public abstract class TileGrid {
    
    public static native TileGrid getTileGrid(TileGridOptions tileGridOptions);
    
}

