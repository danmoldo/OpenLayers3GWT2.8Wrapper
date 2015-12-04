package ol;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import ol.proj.Projection;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface View extends Object {

    @JsMethod
    Extent calculateExtent(Size size);

    @JsMethod
    Coordinate getCenter();

    @JsMethod
    Projection getProjection();

    @JsMethod
    double getResolution();

    @JsMethod
    double getRotation();

    @JsMethod
    double getZoom();

    @JsMethod
    void rotate(double rotation, double[] coordinate);

    @JsMethod
    void setCenter(Coordinate center);

    @JsMethod
    void setResolution(double resolution);

    @JsMethod
    void setRotation(double rotation);

    @JsMethod
    void setZoom(double zoom);

}

