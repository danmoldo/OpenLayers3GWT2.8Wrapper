package olx;

import com.google.gwt.dom.client.Element;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Coordinate;

/**
 * Created by DanMo on 24.11.2015.
 */
@JsType(isNative = true)
public interface OverlayOptions {

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
    void setStopEvent(boolean stopEvent);

    @JsProperty
    void setInsertFirst(boolean insertFirst);

    @JsProperty
    void setAutoPan(boolean autoPan);

    @JsProperty
    void setAutoPanMargin(int autoPanMargin);

}
