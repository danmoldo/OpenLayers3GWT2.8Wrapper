package ol.layer;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import ol.source.*;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Layer extends Base {

    ol.source.Source getSource();

    void setSource(Source source);

}

