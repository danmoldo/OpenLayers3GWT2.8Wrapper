package ol;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface LogoOptions {

    @JsProperty
    void setHref(String href);

    @JsProperty
    void setSrc(String src);

}
