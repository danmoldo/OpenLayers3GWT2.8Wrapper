package today.learnjava.ol3.demo.examples;

import ol.*;
import ol.control.Attribution;
import ol.layer.LayerOptions;
import ol.layer.Tile;
import ol.source.Osm;
import ol.source.TileDebug;
import ol.source.TileDebugOptions;
import ol.source.XyzOptions;

/**
 * @author Dan Moldovan
 */
public class OsmExample implements Example {

    public void show() {
        
        // create a OSM-layer
        XyzOptions osmSourceOptions = OLFactory.createOptions();

        Osm osmSource = OLFactory.createOsm(osmSourceOptions);
        LayerOptions osmLayerOptions = OLFactory.createLayerOptions();
        osmLayerOptions.setSource(osmSource);

        Tile osmLayer = OLFactory.createTileLayer(osmLayerOptions);

        // create debug layer
        TileDebugOptions tileDebugOptions = OLFactory.createOptions();
        tileDebugOptions.setProjection("EPSG:3857");
        tileDebugOptions.setTileGrid(osmSource.getTileGrid());

        TileDebug tileDebugSource = OLFactory.createTileDebug(tileDebugOptions);

        LayerOptions tileDebugLayerOptions = OLFactory.createLayerOptions();

        tileDebugLayerOptions.setSource(tileDebugSource);

        Tile tileDebugLayer = OLFactory.createTileLayer(tileDebugLayerOptions);


        // create a view
        View view = OLFactory.createView();

        Coordinate centerCoordinate = OLFactory.createCoordinateFromLonLat(16.3725, 48.208889);

        view.setCenter(centerCoordinate);
        view.setZoom(10);

        // create the map
        MapOptions mapOptions = OLFactory.createMapOptions();
        mapOptions.setTarget("mapOsm");
        mapOptions.setView(view);

        Map map = OLFactory.createMap(mapOptions);

        map.addLayer(osmLayer);
        map.addLayer(tileDebugLayer);

        // add some controls
        map.addControl(OLFactory.createFullScreen());
        map.addControl(OLFactory.createZoomSlider());
        map.addControl(OLFactory.createMousePosition());
        map.addControl(OLFactory.createZoomToExtent());

        Attribution attribution = Attribution.newInstance();
        attribution.setCollapsed(true);

        map.addControl(attribution);

        // add some interactions
        map.addInteraction(OLFactory.createKeyboardPan());
        map.addInteraction(OLFactory.createKeyboardZoom());
        
        
    }
    
}

