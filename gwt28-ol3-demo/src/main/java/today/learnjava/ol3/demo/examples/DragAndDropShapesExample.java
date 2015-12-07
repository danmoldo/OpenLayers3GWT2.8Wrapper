package today.learnjava.ol3.demo.examples;

import ol.*;
import ol.interaction.Select;
import ol.interaction.Translate;
import olx.MapOptions;
import olx.interaction.TranslateOptions;
import olx.layer.LayerOptions;
import ol.layer.Tile;
import ol.layer.Vector;
import olx.layer.VectorOptions;
import ol.source.*;
import olx.source.MapQuestOptions;
import olx.source.StamenOptions;

/**
 * @author Dan Moldovan
 */
public class DragAndDropShapesExample implements Example {

    public void show() {

        LayerOptions layerOptions = OLFactory.createOptions();

        MapQuestOptions mapQuestOptions = OLFactory.createOptions();
        mapQuestOptions.setLayer("hyb");

        MapQuest mapQuestSource = OLFactory.createMapQuestSource(mapQuestOptions);

        layerOptions.setSource(mapQuestSource);

        Tile mapQuestLayer = OLFactory.createTileLayer(layerOptions);

        LayerOptions stamenLayerOptions = OLFactory.createOptions();
        StamenOptions stamenOptions = OLFactory.createOptions();

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
        MapOptions mapOptions = OLFactory.createOptions();
        Map map = OLFactory.createMap(mapOptions);

        map.addLayer(mapQuestLayer);
        map.addLayer(stamenLayer);

        map.setView(view);
        map.setTarget("mapDragAndDropShapes");

        map.addControl(OLFactory.createScaleLineControl());
        map.addControl(OLFactory.createFullScreenControl());
        map.addControl(OLFactory.createZoomSliderControl());
        map.addControl(OLFactory.createMousePositionControl());
        map.addControl(OLFactory.createZoomToExtentControl());


        VectorOptions vectorLayerOptions = OLFactory.createOptions();
        olx.source.VectorOptions vectorSourceOptions = OLFactory.createOptions();
        vectorSourceOptions.setUrl("http://openlayers.org/en/v3.11.2/examples/data/geojson/countries.geojson");
        vectorSourceOptions.setFormat(OLFactory.createGeoJSONFormat());
        ol.source.Vector vectorSource = OLFactory.createVectorSource(vectorSourceOptions);

        vectorLayerOptions.setSource(vectorSource);
        Vector vectorLayer = OLFactory.createVectorLayer(vectorLayerOptions);


        Select selectInteraction = OLFactory.createSelectInteraction();

        TranslateOptions translateOptions = OLFactory.createOptions();
        translateOptions.setFeatures(selectInteraction.getFeatures());
        Translate translateInteraction = OLFactory.createTranslateInteraction(translateOptions);

        map.addInteraction(selectInteraction);
        map.addInteraction(translateInteraction);
        map.addLayer(vectorLayer);
    }
}
