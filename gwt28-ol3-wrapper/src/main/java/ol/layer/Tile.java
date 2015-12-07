package ol.layer;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Tile extends Layer {

    double getPreload();

    ol.source.Tile getSource();

    boolean getUseInterimTilesOnError();

    void setPreload(double preload);

    void setUseInterimTilesOnError(boolean useInterimTilesOnError);

}

