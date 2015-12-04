package ol;

import com.google.gwt.dom.client.Element;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Created by DanMo on 19.11.2015.
 */
@JsType(isNative = true)
public interface Overlay extends Object{

    @JsProperty
    void setId(String id);

    @JsProperty
    void setElement(Element element);

    @JsProperty
    void setOffset(int[] offset);

    @JsProperty
    void setPosition(Coordinate coordinate);

    @JsProperty
    void setPositioning(String positioning);

    @JsProperty
    String getId();

    @JsProperty
    Element getElement();

    @JsProperty
    int[] getOffset();

    @JsProperty
    Coordinate getPosition();

    @JsProperty
    String getPositioning();

}
