package today.learnjava.ol3.demo.examples;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.Window;
import ol.*;
import ol.event.ListenerFunction;
import ol.functions.FeatureLayerFunction;
import ol.layer.Layer;
import ol.layer.Tile;
import ol.layer.Vector;
import ol.source.MapQuest;
import ol.style.Fill;
import ol.style.Style;
import ol.style.StyleFunction;
import ol.style.Text;
import olx.MapOptions;
import olx.layer.LayerOptions;
import olx.layer.VectorOptions;
import olx.source.MapQuestOptions;
import olx.style.FillOptions;
import olx.style.StyleOptions;
import olx.style.TextOptions;

import java.util.HashMap;

/**
 * @autor Dan Moldovan
 */
public class CountryVectorLayerExample implements Example {

    public void show() {

        // create a view
        View view = OLFactory.createView();
        Coordinate centerCoordinate = OLFactory.createCoordinateFromLonLat(16.3725, 48.208889);
        view.setCenter(centerCoordinate);
        view.setZoom(4);

        // create the map
        MapOptions mapOptions = OLFactory.createOptions();
        mapOptions.setTarget("mapCountryVectorLayer");
        mapOptions.setView(view);
        final Map map = OLFactory.createMap(mapOptions);

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

        // create a MapQuest-layer
        LayerOptions mapQuestLayerOptions = OLFactory.createOptions();
        MapQuestOptions mapQuestOptions = OLFactory.createOptions();
        mapQuestOptions.setLayer("sat");
        MapQuest mapQuestSource = OLFactory.createMapQuestSource(mapQuestOptions);
        mapQuestLayerOptions.setSource(mapQuestSource);
        Tile mapQuestLayer = OLFactory.createTileLayer(mapQuestLayerOptions);

        // create country vector layer
        VectorOptions vectorLayerOptions = OLFactory.createOptions();
        olx.source.VectorOptions vectorSourceOptions = OLFactory.createOptions();
        vectorSourceOptions.setUrl("http://openlayers.org/en/v3.11.2/examples/data/geojson/countries.geojson");
        vectorSourceOptions.setFormat(OLFactory.createGeoJSONFormat());
        ol.source.Vector vectorSource = OLFactory.createVectorSource(vectorSourceOptions);
        vectorLayerOptions.setSource(vectorSource);
        Vector vectorLayer = OLFactory.createVectorLayer(vectorLayerOptions);

        map.addLayer(mapQuestLayer);
        map.addLayer(vectorLayer);

        map.on("pointermove", new ListenerFunction() {
            public void exec(MapBrowserEvent event) {
                Pixel pixel = map.getEventPixel(event.getOriginalEvent());
                map.forEachFeatureAtPixel(pixel, new FeatureLayerFunction() {
                    public void exec(Feature feature, Layer layer) {
                        Element element = Document.get().getElementById("info");
                        element.setInnerHTML((String)feature.get("name"));
                    }
                });
            }
        });


    }
}
