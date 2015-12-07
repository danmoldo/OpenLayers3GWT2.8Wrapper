package olx.source;


import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public interface MapQuestOptions {
    
    /**
     * 
     * @param layer osm, sat, hyb
     */
    @JsProperty
    void setLayer(String layer);
    
}

