package olx.proj;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface ProjectionOptions {

    @JsProperty
    void setCode(String code);

    @JsProperty
    void setUnits(String units);

    @JsProperty
    void setGlobal(boolean global);

    @JsProperty
    void setExtent(double[] extent);

}

