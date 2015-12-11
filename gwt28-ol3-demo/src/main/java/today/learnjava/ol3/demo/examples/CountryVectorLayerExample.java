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
import ol.style.*;
import olx.MapOptions;
import olx.layer.LayerOptions;
import olx.layer.VectorOptions;
import olx.source.MapQuestOptions;
import olx.style.FillOptions;
import olx.style.StrokeOptions;
import olx.style.StyleOptions;
import olx.style.TextOptions;

import java.util.HashMap;

/**
 * @autor Dan Moldovan
 */
public class CountryVectorLayerExample implements Example {

    Feature highlighted;

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
        vectorLayer.setStyle(new StyleFunction() {
            public Style exec(Feature feature, int resolution) {
                StyleOptions styleOptions = OLFactory.createOptions();
                FillOptions fillOptions = OLFactory.createOptions();
                fillOptions.setColor("rgba(255, 255, 255, 0.6)");
                Fill fill = OLFactory.createFill(fillOptions);
                styleOptions.setFill(fill);
                StrokeOptions strokeOptions = OLFactory.createOptions();
                strokeOptions.setColor("#319FD3");
                Stroke stroke = OLFactory.createStrokeStyle(strokeOptions);
                styleOptions.setStroke(stroke);
                Style style = OLFactory.createStyle(styleOptions);
                feature.setStyle(style);
                return style;
            }
        });
        map.addLayer(mapQuestLayer);
        map.addLayer(vectorLayer);



        VectorOptions featureOverlayOptions = OLFactory.createOptions();
        featureOverlayOptions.setSource(OLFactory.createVectorSource((olx.source.VectorOptions) OLFactory.createOptions()));

        final Vector featureOverlay = OLFactory.createVectorLayer(featureOverlayOptions);

        map.addLayer(featureOverlay);

        map.on("pointermove", new ListenerFunction() {
            public void exec(MapBrowserEvent event) {
                Pixel pixel = map.getEventPixel(event.getOriginalEvent());
                map.forEachFeatureAtPixel(pixel, new FeatureLayerFunction() {
                    public void exec(Feature feature, Layer layer) {
                        Element element = Document.get().getElementById("info");
                        element.setInnerHTML((String) feature.get("name"));

                        if (featureOverlay.getSource().getFeatures().length > 0) {
                            featureOverlay.getSource().removeFeature(highlighted);
                        }
                        featureOverlay.getSource().addFeature(feature);
                        highlighted = feature;
                    }
                });
            }
        });

    }
}
