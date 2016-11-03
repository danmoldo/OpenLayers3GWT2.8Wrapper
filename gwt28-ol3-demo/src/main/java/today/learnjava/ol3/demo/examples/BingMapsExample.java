package today.learnjava.ol3.demo.examples;

import ol.*;
import olx.MapOptions;
import olx.layer.LayerOptions;
import ol.layer.Tile;
import ol.source.BingMaps;
import olx.source.BingMapsOptions;

/**
 * @author Dan Moldovan
 */
public class BingMapsExample implements Example {

    final static String API_KEY = "YOUR-BING-MAPS-sAPI-KEY";

    public void show() {

        // create a view
        View view = OLFactory.createView();

        Coordinate centerCoordinate = OLFactory.createCoordinateFromLonLat(0,0);

        view.setCenter(centerCoordinate);
        view.setZoom(2);


        BingMapsOptions bingMapsOptions = OLFactory.createOptions();
        bingMapsOptions.setImagerySet("Road");
        bingMapsOptions.setKey(API_KEY);
        BingMaps bingMaps = OLFactory.createBingMaps(bingMapsOptions);

        LayerOptions layerOptions = OLFactory.createOptions();
        layerOptions.setSource(bingMaps);
        Tile bingTile = OLFactory.createTileLayer(layerOptions);


        // create the map
        MapOptions mapOptions = OLFactory.createOptions();
        Map map = OLFactory.createMap(mapOptions);

        map.addLayer(bingTile);

        map.setView(view);
        map.setTarget("mapBingMaps");

        map.addControl(OLFactory.createScaleLineControl());
        map.addControl(OLFactory.createFullScreenControl());
        map.addControl(OLFactory.createZoomSliderControl());
        map.addControl(OLFactory.createMousePositionControl());
        map.addControl(OLFactory.createZoomToExtentControl());

    }
}
