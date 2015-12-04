package today.learnjava.ol3.demo.examples;

import ol.*;
import ol.interaction.Select;
import ol.interaction.Translate;
import ol.interaction.TranslateOptions;
import ol.layer.LayerOptions;
import ol.layer.Tile;
import ol.layer.Vector;
import ol.layer.VectorOptions;
import ol.source.BingMaps;
import ol.source.BingMapsOptions;
import ol.source.MapQuest;
import ol.source.MapQuestOptions;

/**
 * @author Dan Moldovan
 */
public class BingMapsExample implements Example {

    final static String API_KEY = "YOUR-BING-MAPS-sAPI-KEY";

    public void show() {

        LayerOptions layerOptions = OLFactory.createLayerOptions();

        MapQuestOptions mapQuestOptions = OLFactory.createMapQuestOptions();
        mapQuestOptions.setLayer("hyb");

        MapQuest mapQuestSource = OLFactory.createMapQuestSource(mapQuestOptions);

        layerOptions.setSource(mapQuestSource);

        Tile mapQuestLayer = OLFactory.createTileLayer(layerOptions);

        // create a view
        View view = OLFactory.createView();

        Coordinate centerCoordinate = OLFactory.createCoordinateFromLonLat(0,0);

        view.setCenter(centerCoordinate);
        view.setZoom(2);


        BingMapsOptions bingMapsOptions = OLFactory.createBingMapOptions();
        bingMapsOptions.setImagerySet("Road");
        bingMapsOptions.setKey(API_KEY);
        BingMaps bingMaps = OLFactory.createBingMaps(bingMapsOptions);

        layerOptions = OLFactory.createLayerOptions();
        layerOptions.setSource(bingMaps);
        Tile bingTile = OLFactory.createTileLayer(layerOptions);


        // create the map
        MapOptions mapOptions = OLFactory.createMapOptions();
        Map map = OLFactory.createMap(mapOptions);

        map.addLayer(mapQuestLayer);
        map.addLayer(bingTile);

        map.setView(view);
        map.setTarget("mapBingMaps");

        map.addControl(OLFactory.createScaleLine());
        map.addControl(OLFactory.createFullScreen());
        map.addControl(OLFactory.createZoomSlider());
        map.addControl(OLFactory.createMousePosition());
        map.addControl(OLFactory.createZoomToExtent());

    }
}
