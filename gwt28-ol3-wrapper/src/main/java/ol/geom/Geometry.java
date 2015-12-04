package ol.geom;

import jsinterop.annotations.JsType;

import ol.Observable;

/**
 * Base for vector geometries.
 *
 * @author DanMo
 *
 */
@JsType(isNative = true)
public interface Geometry extends Observable {

    Geometry clone();

}

