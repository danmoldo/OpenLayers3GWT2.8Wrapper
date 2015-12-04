package ol.source;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public interface MapQuest extends Xyz {
    
    @JsMethod
    void setLayer(String layer);
    
}

