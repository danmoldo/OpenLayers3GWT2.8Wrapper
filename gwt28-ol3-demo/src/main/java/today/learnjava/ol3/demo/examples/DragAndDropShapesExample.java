package today.learnjava.ol3.demo.examples;

import ol.*;
import ol.interaction.Select;
import ol.interaction.Translate;
import ol.interaction.TranslateOptions;
import ol.layer.LayerOptions;
import ol.layer.Tile;
import ol.layer.Vector;
import ol.layer.VectorOptions;
import ol.source.*;

/**
 * @author Dan Moldovan
 */
public class DragAndDropShapesExample implements Example {

    public void show() {

        LayerOptions layerOptions = OLFactory.createLayerOptions();

        MapQuestOptions mapQuestOptions = OLFactory.createMapQuestOptions();
        mapQuestOptions.setLayer("hyb");

        MapQuest mapQuestSource = OLFactory.createMapQuestSource(mapQuestOptions);

        layerOptions.setSource(mapQuestSource);

        Tile mapQuestLayer = OLFactory.createTileLayer(layerOptions);

        LayerOptions stamenLayerOptions = OLFactory.createLayerOptions();
        StamenOptions stamenOptions = OLFactory.createStamenOptions();

        stamenOptions.setLayer("watercolor");
        Stamen stamenSource = OLFactory.createStamenSource(stamenOptions);
        stamenLayerOptions.setSource(stamenSource);
        Tile stamenLayer = OLFactory.createTileLayer(stamenLayerOptions);

        // create a view
        View view = OLFactory.createView();

        Coordinate centerCoordinate = OLFactory.createCoordinateFromLonLat(0, 0);

        view.setCenter(centerCoordinate);
        view.setZoom(2);


        // create the map
        MapOptions mapOptions = OLFactory.createMapOptions();
        Map map = OLFactory.createMap(mapOptions);

        map.addLayer(mapQuestLayer);
        map.addLayer(stamenLayer);

        map.setView(view);
        map.setTarget("mapDragAndDropShapes");

        map.addControl(OLFactory.createScaleLine());
        map.addControl(OLFactory.createFullScreen());
        map.addControl(OLFactory.createZoomSlider());
        map.addControl(OLFactory.createMousePosition());
        map.addControl(OLFactory.createZoomToExtent());


        VectorOptions vectorLayerOptions = OLFactory.createVectorLayerOptions();
        ol.source.VectorOptions vectorSourceOptions = OLFactory.createVectorSourceOptions();
        vectorSourceOptions.setUrl("http://openlayers.org/en/v3.11.2/examples/data/geojson/countries.geojson");
        vectorSourceOptions.setFormat(OLFactory.createGeoJSONFormat());
        ol.source.Vector vectorSource = OLFactory.createVectorSource(vectorSourceOptions);

        vectorLayerOptions.setSource(vectorSource);
        Vector vectorLayer = OLFactory.createVectorLayer(vectorLayerOptions);


        Select selectInteraction = OLFactory.createSelectInteraction();

        TranslateOptions translateOptions = OLFactory.createTranslateOptions();
        translateOptions.setFeatures(selectInteraction.getFeatures());
        Translate translateInteraction = OLFactory.createTranslateInteraction(translateOptions);

        map.addInteraction(selectInteraction);
        map.addInteraction(translateInteraction);
        map.addLayer(vectorLayer);
    }
}
