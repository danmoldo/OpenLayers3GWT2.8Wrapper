package olx.control;

import com.google.gwt.dom.client.Element;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface ControlOptions {

    @JsProperty
    void setElement(Element element);

}
