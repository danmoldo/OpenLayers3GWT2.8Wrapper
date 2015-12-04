package ol;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public interface Object extends Observable {
    
    <T> ObjectAccessor bindTo(String key, T target);

    @JsMethod
    java.lang.Object get(String key);

    
}

