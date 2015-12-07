package ol.layer;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import ol.Extent;
import ol.Object;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Base extends Object {

    Extent getExtent();

    double getMaxResolution();

    double getMinResolution();

    double getOpacity();

    boolean getVisible();

    double getZIndex();

    void setExtent(Extent extent);

    void setMaxResolution(double maxResolution);

    void setMinResolution(double minResolution);

    void setOpacity(double opacity);

    void setVisible(boolean visible);

    void setZIndex(double visible);

}

