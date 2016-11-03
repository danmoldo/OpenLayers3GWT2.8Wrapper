package today.learnjava.ol3.demo.examples;

import com.google.gwt.dom.client.Document;
import ol.*;
import ol.event.ListenerFunction;
import ol.layer.Tile;
import ol.source.Stamen;
import olx.MapOptions;
import olx.OverlayOptions;
import olx.layer.LayerOptions;
import olx.source.StamenOptions;

/**
 * @author Dan Moldovan
 */
public class OverlayExample implements Example {

    public void show() {

        // create a Stamen-layer
        LayerOptions stamenLayerOptions = OLFactory.createOptions();

        StamenOptions stamenOptions = OLFactory.createOptions();
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
        MapOptions mapOptions = OLFactory.createOptions();
        mapOptions.setTarget("mapOverlay");
        mapOptions.setView(view);

        final Map map = OLFactory.createMap(mapOptions);

        stamenLayer.setOpacity(0.5f);
        map.addLayer(stamenLayer);


        // add some controls
        map.addControl(OLFactory.createScaleLineControl());
        map.addControl(OLFactory.createFullScreenControl());
        map.addControl(OLFactory.createZoomSliderControl());
        map.addControl(OLFactory.createMousePositionControl());
        map.addControl(OLFactory.createZoomToExtentControl());
        map.addControl(OLFactory.createRotateControl());


        // add some interactions
        map.addInteraction(OLFactory.createKeyboardPan());
        map.addInteraction(OLFactory.createKeyboardZoom());



        OverlayOptions overlayOptions = OLFactory.createOptions();
        overlayOptions.setElement(Document.get().getElementById("marker"));
        overlayOptions.setPosition(OLFactory.createCoordinateFromLonLat(16.3725, 48.208889));
        overlayOptions.setPositioning("center-right");
        Overlay overlay = OLFactory.createOverlay(overlayOptions);
        map.addOverlay(overlay);

        overlayOptions = OLFactory.createOptions();
        overlayOptions.setElement(Document.get().getElementById("vienna"));
        overlayOptions.setPosition(OLFactory.createCoordinateFromLonLat(16.3725, 48.208889));
        overlayOptions.setPositioning("center-left");
        overlay = OLFactory.createOverlay(overlayOptions);
        map.addOverlay(overlay);

        overlayOptions = OLFactory.createOptions();
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
