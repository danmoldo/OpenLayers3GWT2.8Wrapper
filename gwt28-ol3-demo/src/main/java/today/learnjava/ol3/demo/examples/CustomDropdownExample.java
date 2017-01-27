package today.learnjava.ol3.demo.examples;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import ol.Coordinate;
import ol.Map;
import ol.OLFactory;
import ol.View;
import ol.control.Attribution;
import ol.control.Control;
import ol.event.ListenerFunction;
import ol.layer.Tile;
import ol.source.Osm;
import ol.source.TileDebug;
import olx.MapOptions;
import olx.control.ControlOptions;
import olx.layer.LayerOptions;
import olx.source.TileDebugOptions;
import olx.source.XyzOptions;

/**
 * Created by Dan Moldovan on 26.01.2017.
 */
public class CustomDropdownExample implements Example {

    public void show() {

        // create a OSM-layer
        XyzOptions osmSourceOptions = OLFactory.createOptions();

        Osm osmSource = OLFactory.createOsm(osmSourceOptions);
        LayerOptions osmLayerOptions = OLFactory.createOptions();
        osmLayerOptions.setSource(osmSource);

        Tile osmLayer = OLFactory.createTileLayer(osmLayerOptions);

        // create debug layer
        TileDebugOptions tileDebugOptions = OLFactory.createOptions();
        tileDebugOptions.setProjection("EPSG:3857");
        tileDebugOptions.setTileGrid(osmSource.getTileGrid());

        TileDebug tileDebugSource = OLFactory.createTileDebug(tileDebugOptions);

        LayerOptions tileDebugLayerOptions = OLFactory.createOptions();

        tileDebugLayerOptions.setSource(tileDebugSource);

        Tile tileDebugLayer = OLFactory.createTileLayer(tileDebugLayerOptions);


        // create a view
        View view = OLFactory.createView();

        Coordinate centerCoordinate = OLFactory.createCoordinateFromLonLat(16.3725, 48.208889);

        view.setCenter(centerCoordinate);
        view.setZoom(10);

        // create the map
        MapOptions mapOptions = OLFactory.createOptions();
        mapOptions.setTarget("mapDropdown");
        mapOptions.setView(view);

        Map map = OLFactory.createMap(mapOptions);

        map.addLayer(osmLayer);
        map.addLayer(tileDebugLayer);

        // add some controls
        map.addControl(OLFactory.createFullScreenControl());
        map.addControl(OLFactory.createZoomSliderControl());
        map.addControl(OLFactory.createZoomToExtentControl());

        Attribution attribution = OLFactory.createAttributionControl();
        attribution.setCollapsed(true);

        map.addControl(attribution);


        Button button = new Button();
        button.setWidth("50px");
        button.setText("Hello");

        Event.sinkEvents(button.getElement(), Event.ONCLICK);
        Event.setEventListener(button.getElement(), new EventListener() {
            public void onBrowserEvent(Event event) {
                if(Event.ONCLICK == event.getTypeInt()) {
                    Window.alert("You clicked on the Hello button");
                }
            }
        });

        final ListBox listBox = new ListBox();
        listBox.addItem("Item 1", "1");
        listBox.addItem("Item 2", "2");
        listBox.addItem("Item 3", "3");
        listBox.addItem("Item 4", "4");
        listBox.addItem("Item 5", "5");


        Event.sinkEvents(listBox.getElement(), Event.ONCHANGE);
        Event.setEventListener(listBox.getElement(), new EventListener() {
            public void onBrowserEvent(Event event) {
                if(Event.ONCHANGE == event.getTypeInt()) {

                    Window.alert("Value Changed to " + listBox.getSelectedValue() + " | " + listBox.getSelectedItemText());
                }
            }
        });

        Element element = DOM.createDiv();
        element.addClassName("ol-unselectable ol-control");
        element.getStyle().setTop(5, Style.Unit.PX);
        element.getStyle().setRight(65, Style.Unit.PX);
        element.appendChild(button.getElement());
        element.appendChild(listBox.getElement());


        ControlOptions controlOptions = OLFactory.createOptions();
        controlOptions.setElement(element);
        Control customControl = OLFactory.createControl(controlOptions);

        map.addControl(customControl);

        // add some interactions
        map.addInteraction(OLFactory.createKeyboardPan());
        map.addInteraction(OLFactory.createKeyboardZoom());


    }

}