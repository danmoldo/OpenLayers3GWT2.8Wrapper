package ol;

import jsinterop.annotations.JsType;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public abstract class Collection<T> implements Object {
    
    public static native <T> Collection<T> getCollection();

    public abstract void clear();
    
    public abstract T[] getArray();
    
    public abstract int getLength();
    
    public abstract void insertAt(int index, T element);
    
    public abstract T item(int index);
    
    public abstract void pop();
    
    public abstract void push(T element);
    
    public abstract void remove(T element);
    
    public abstract void removeAt(int index);
    
    public abstract void setAt(int index, T element);
    
}

