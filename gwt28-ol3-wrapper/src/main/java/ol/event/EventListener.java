package ol.event;

import jsinterop.annotations.JsType;

@JsType(isNative = true)
public abstract class EventListener<E extends Event> {

    protected abstract void on(E event);
    
    public static native <E extends Event> EventListener<E> createEventListener(EventListener<E> listener) /*-{
        return function(evt){
            listener.on(evt);
        }
    }-*/;
    
}

