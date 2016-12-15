package ol;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Object extends Observable {
    
    <T> ObjectAccessor bindTo(String key, T target);

    @JsMethod
    java.lang.Object get(String key);

    @JsMethod
    void set(String key, java.lang.Object value, boolean silent);

    @JsMethod
    java.util.Map<String, java.lang.Object> getProperties();

    @JsMethod
    void setProperties(java.util.Map<String, java.lang.Object> properties, boolean silent);
    
}

