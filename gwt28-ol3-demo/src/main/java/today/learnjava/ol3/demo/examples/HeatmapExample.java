package today.learnjava.ol3.demo.examples;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.Window;
import ol.Coordinate;
import ol.Map;
import ol.OLFactory;
import ol.View;
import ol.layer.Heatmap;
import ol.layer.Tile;
import ol.source.Stamen;
import olx.MapOptions;
import olx.format.KMLOptions;
import olx.layer.LayerOptions;
import olx.source.StamenOptions;
import olx.source.VectorOptions;

/**
 * @author Dan Moldovan
 */
public class HeatmapExample implements Example {

    public void show() {

        // create a view
        View view = OLFactory.createView();
        Coordinate centerCoordinate = OLFactory.createCoordinateFromLonLat(16.3725, 48.208889);
        view.setCenter(centerCoordinate);
        view.setZoom(4);

        // create the map
        MapOptions mapOptions = OLFactory.createOptions();
        mapOptions.setTarget("mapHeatmap");
        mapOptions.setView(view);
        Map map = OLFactory.createMap(mapOptions);

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

        StamenOptions stamenOptions = OLFactory.createOptions();
        stamenOptions.setLayer("toner");
        Stamen stamen = OLFactory.createStamenSource(stamenOptions);
        LayerOptions tileOptions = OLFactory.createOptions();
        tileOptions.setSource(stamen);
        Tile raster = OLFactory.createTileLayer(tileOptions);

        LayerOptions heatmapOptions = OLFactory.createOptions();
        VectorOptions vectorOptions = OLFactory.createOptions();
        vectorOptions.setUrl("http://openlayers.org/en/v3.11.2/examples/data/kml/2012_Earthquakes_Mag5.kml");
        KMLOptions kmlOptions = OLFactory.createOptions();
        kmlOptions.setExtractStyles(false);
        vectorOptions.setFormat(OLFactory.createKMLFormat(kmlOptions));
        ol.source.Vector vector = OLFactory.createVectorSource(vectorOptions);
        heatmapOptions.setSource(vector);
        final Heatmap heatmap = OLFactory.createHeatmapLayer(heatmapOptions);
        heatmap.setBlur(10);
        heatmap.setRadius(15);

        map.addLayer(raster);
        map.addLayer(heatmap);

        final Element radius = Document.get().getElementById("radius");
        if (radius != null) {
            Event.sinkEvents(radius, Event.ONMOUSEMOVE);
            Event.setEventListener(radius, new EventListener() {
                public void onBrowserEvent(Event event) {
                    InputElement radius = InputElement.as(Document.get().getElementById("radius"));
                    heatmap.setRadius(Double.parseDouble(radius.getValue()));
                }
            });
        }

        final Element blur = Document.get().getElementById("blur");
        if (blur != null) {
            Event.sinkEvents(blur, Event.ONMOUSEMOVE);
            Event.setEventListener(blur, new EventListener() {
                public void onBrowserEvent(Event event) {
                    InputElement blur = InputElement.as(Document.get().getElementById("blur"));
                    heatmap.setBlur(Double.parseDouble(blur.getValue()));
                }
            });
        }
    }

}
