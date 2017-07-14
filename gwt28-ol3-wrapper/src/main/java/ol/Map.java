package ol;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.user.client.Event;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import ol.control.Control;
import ol.functions.FeatureLayerFunction;
import ol.interaction.Interaction;
import ol.layer.Base;
import ol.layer.Group;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface Map extends Object {

    @JsMethod
    void addControl(Control control);

    @JsMethod
    void addInteraction(Interaction interaction);

    @JsMethod
    void addLayer(Base layer);

    @JsMethod
    void addOverlay(Overlay overlay);

    @JsMethod
    void forEachFeatureAtPixel(Pixel pixel, FeatureLayerFunction featureLayerFunction);

    @JsMethod
    boolean hasFeatureAtPixel(Pixel pixel);

    //TODO forEachLayerAtPixel

    @JsMethod
    Collection<Control> getControls();

    @JsMethod
    Coordinate getCoordinateFromPixel(Pixel pixel);

    @JsMethod
    Coordinate getEventCoordinate(Event event);

    @JsMethod
    Pixel getEventPixel(Event event);

    @JsMethod
    Collection<Interaction> getInteractions();

    @JsMethod
    Group getLayerGroup();

    @JsMethod
    Collection<Base> getLayers();

    @JsMethod
    Collection<Overlay> getOverlays();

    @JsMethod
    Pixel getPixelFromCoordinate(Coordinate coordinate);

    @JsMethod
    Size getSize();

    @JsMethod
    String getTarget();

    @JsMethod
    View getView();

    @JsMethod
    Element getViewport();

    @JsMethod
    void removeControl(Control control);

    @JsMethod
    void removeInteraction(Interaction interaction);

    @JsMethod
    void removeLayer(Base layer);

    @JsMethod
    void removeOverlay(Overlay overlay);

    @JsMethod
    void render();

    @JsMethod
    void renderSync();

    @JsMethod
    void setLayerGroup(Group group);

    @JsMethod
    void setTarget(Element target);

    @JsMethod
    void setTarget(String target);

    @JsMethod
    void setView(View view);

    @JsMethod
    double getPixelRatio();

    @JsMethod
    void updateSize();

}
