package ol.interaction;

import goog.events.Event;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Collection;
import ol.Feature;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Select extends Interaction {

    @JsMethod
    Collection<Feature> getFeatures();

    @JsType(isNative = true)
    interface Event extends goog.events.Event {

        @JsProperty
        Feature[] getSelected();
    }

}
