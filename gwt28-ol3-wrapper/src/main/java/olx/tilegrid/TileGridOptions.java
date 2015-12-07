package olx.tilegrid;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * 
 * @author Dan Moldovan
 *
 */
@JsType(isNative = true)
public interface TileGridOptions {
	
    @JsMethod
    void setExtent(double[] extent);
    
    @JsMethod
    void setMinZoom(double minZoom);
    
    @JsMethod
    void setOrigin(double[] coodinate);
    
    @JsMethod
    void setOrigins(double[] origins);
	
    @JsMethod
	void setResolutions(double[] resolutions);
	
    @JsMethod
	void setTileSize(int tileSize);
    
    @JsMethod
    void setTileSizes(int[] tileSizes);
	
}

