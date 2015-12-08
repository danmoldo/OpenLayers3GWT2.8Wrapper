package ol.style;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Feature;
import ol.MapBrowserEvent;
import ol.OLFactory;

/**
 * @author Dan Moldovan
 */
@FunctionalInterface
@JsFunction
public interface StyleFunction {

    public void exec(Feature feature, int resolution);

}
