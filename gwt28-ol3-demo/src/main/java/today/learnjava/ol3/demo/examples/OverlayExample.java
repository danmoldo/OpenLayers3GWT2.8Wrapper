package today.learnjava.ol3.demo.examples;

import com.google.gwt.dom.client.Document;
import ol.*;
import ol.event.ListenerFunction;
import ol.layer.LayerOptions;
import ol.layer.Tile;
import ol.source.*;

/**
 * @author Dan Moldovan
 */
public class OverlayExample implements Example {

    public void show() {

        // create a MapQuest-layer
        LayerOptions mapQuestLayerOptions = OLFactory.createLayerOptions();

        MapQuestOptions mapQuestOptions = OLFactory.createMapQuestOptions();
        mapQuestOptions.setLayer("hyb");

        MapQuest mapQuestSource = OLFactory.createMapQuestSource(mapQuestOptions);

        mapQuestLayerOptions.setSource(mapQuestSource);

        Tile mapQuestLayer = OLFactory.createTileLayer(mapQuestLayerOptions);

        LayerOptions stamenLayerOptions = OLFactory.createLayerOptions();


        // create a Stamen-layer
        StamenOptions stamenOptions = OLFactory.createStamenOptions();

        stamenOptions.setLayer("watercolor");
        Stamen stamenSource = OLFactory.createStamenSource(stamenOptions);
        stamenLayerOptions.setSource(stamenSource);
        Tile stamenLayer = OLFactory.createTileLayer(stamenLayerOptions);


        // create a view
        View view = OLFactory.createView();

        Coordinate centerCoordinate = OLFactory.createCoordinateFromLonLat(16.3725, 48.208889);

        view.setCenter(centerCoordinate);
        view.setZoom(5);

        // create the map
        MapOptions mapOptions = OLFactory.createMapOptions();
        mapOptions.setTarget("mapOverlay");
        mapOptions.setView(view);

        final Map map = OLFactory.createMap(mapOptions);

        stamenLayer.setOpacity(0.5f);
        map.addLayer(mapQuestLayer);
        map.addLayer(stamenLayer);


        // add some controls
        map.addControl(OLFactory.createScaleLine());
        map.addControl(OLFactory.createFullScreen());
        map.addControl(OLFactory.createZoomSlider());
        map.addControl(OLFactory.createMousePosition());
        map.addControl(OLFactory.createZoomToExtent());


        // add some interactions
        map.addInteraction(OLFactory.createKeyboardPan());
        map.addInteraction(OLFactory.createKeyboardZoom());

        map.addControl(OLFactory.createRotate());


        OverlayOptions overlayOptions = OLFactory.createOverlayOptions();
        overlayOptions.setElement(Document.get().getElementById("marker"));
        overlayOptions.setPosition(OLFactory.createCoordinateFromLonLat(16.3725, 48.208889));
        overlayOptions.setPositioning("center-right");
        Overlay overlay = OLFactory.createOverlay(overlayOptions);
        map.addOverlay(overlay);

        overlayOptions = OLFactory.createOverlayOptions();
        overlayOptions.setElement(Document.get().getElementById("vienna"));
        overlayOptions.setPosition(OLFactory.createCoordinateFromLonLat(16.3725, 48.208889));
        overlayOptions.setPositioning("center-left");
        overlay = OLFactory.createOverlay(overlayOptions);
        map.addOverlay(overlay);

        overlayOptions = OLFactory.createOverlayOptions();
        overlayOptions.setElement(Document.get().getElementById("popup"));
        overlayOptions.setId("ovPop");
        overlay = OLFactory.createOverlay(overlayOptions);
        overlay.setId("ovPop");
        map.addOverlay(overlay);

        final Overlay overlayFinal = overlay;

        map.on("click", new ListenerFunction() {
            public void exec(MapBrowserEvent event) {

                Util.showPopup(overlayFinal, event.getCoordinate());

            }
        });

    }

}
