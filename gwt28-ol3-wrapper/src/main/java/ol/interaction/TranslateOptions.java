package ol.interaction;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Collection;
import ol.Feature;

/**
 * Created by DanMo on 27.11.2015.
 */
@JsType(isNative = true)
public interface TranslateOptions {

    @JsProperty
    void setFeatures(Collection<Feature> features);

}
