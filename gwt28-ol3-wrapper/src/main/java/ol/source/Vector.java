package ol.source;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import ol.Collection;
import ol.Extent;
import ol.Feature;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Vector extends Source {

    @JsMethod
    void addFeature(Feature feature);

    @JsMethod
    void addFeatures(Feature[] features);

    @JsMethod
    void clear();

    //TODO forEachFeature

    @JsMethod
    Feature getClosestFeatureToCoordinate(double[] coordinate);

    @JsMethod
    Extent getExtent();

    @JsMethod
    Feature getFeatureById(String id);

    @JsMethod
    Feature[] getFeatures();

    @JsMethod
    Collection<Feature> getFeaturesCollection();

    @JsMethod
    Feature[] getFeaturesAtCoordinate(double[] coordinate);

    @JsMethod
    void removeFeature(Feature feature);

}
