package ol.layer;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public interface Tile extends Layer {

    @JsProperty
    ol.source.Tile getSource();

}

