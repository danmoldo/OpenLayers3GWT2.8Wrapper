package ol.layer;

import jsinterop.annotations.JsType;

import ol.Object;

/**
 * Base for OL3-Layers.
 *
 * @author DanMo
 *
 */
@JsType(isNative = true)
public interface Base extends Object {

    float getBrightness();

    void setBrightness(float brightness);

    float getContrast();

    void setContrast(float contrast);

    float getMaxResolution();

    void setMaxResolution(float maxResolution);

    float getMinResolution();

    void setMinResolution(float minResolution);

    float getOpacity();

    void setOpacity(float opacity);

    float getSaturation();

    void setSaturation(float saturation);

    boolean getVisible();

    void setVisible(boolean visible);

}

