package ol.functions;

import jsinterop.annotations.JsFunction;
import ol.Feature;
import ol.layer.Layer;

/**
 * @author Dan Moldovan
 */
@FunctionalInterface
@JsFunction
public interface FeatureLayerFunction {

    void exec(Feature feature, Layer layer);

}
