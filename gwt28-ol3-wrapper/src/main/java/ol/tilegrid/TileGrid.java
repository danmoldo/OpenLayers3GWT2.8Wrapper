package ol.tilegrid;

import jsinterop.annotations.JsType;
import olx.tilegrid.TileGridOptions;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public abstract class TileGrid {
    
    public static native TileGrid getTileGrid(TileGridOptions tileGridOptions);
    
}

