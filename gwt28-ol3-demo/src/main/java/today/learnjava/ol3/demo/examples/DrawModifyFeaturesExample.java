package today.learnjava.ol3.demo.examples;

import ol.*;
import ol.interaction.Draw;
import ol.interaction.Modify;
import ol.interaction.Select;
import ol.interaction.Translate;
import ol.layer.Tile;
import ol.layer.Vector;
import ol.source.MapQuest;
import ol.source.Stamen;
import olx.MapOptions;
import olx.interaction.DrawOptions;
import olx.interaction.ModifyOptions;
import olx.interaction.TranslateOptions;
import olx.layer.LayerOptions;
import olx.layer.VectorOptions;
import olx.layer.VectorTileOptions;
import olx.source.MapQuestOptions;
import olx.source.StamenOptions;

/**
 * @author Dan Moldovan
 */
public class DrawModifyFeaturesExample implements Example {

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
        map.setTarget("mapDrawModifyFeatures");

        map.addControl(OLFactory.createScaleLineControl());
        map.addControl(OLFactory.createFullScreenControl());
        map.addControl(OLFactory.createZoomSliderControl());
        map.addControl(OLFactory.createMousePositionControl());
        map.addControl(OLFactory.createZoomToExtentControl());

        Collection<Feature> features = OLFactory.createCollection();
        VectorOptions featureOverlayOptions = OLFactory.createOptions();
        olx.source.VectorOptions vectorSourceOptions = OLFactory.createOptions();
        vectorSourceOptions.setFeatures(features);     //Posible problem
        ol.source.Vector vectorSource = OLFactory.createVectorSource(vectorSourceOptions);
        featureOverlayOptions.setSource(vectorSource);
        Vector featureOverlay = OLFactory.createVectorLayer(featureOverlayOptions);

        map.addLayer(featureOverlay);

        DrawOptions drawOptions = OLFactory.createOptions();
        drawOptions.setFeatures(features);
        drawOptions.setType("Polygon");
        Draw draw = OLFactory.createDraw(drawOptions);

        map.addInteraction(draw);

        ModifyOptions modifyOptions = OLFactory.createOptions();
        modifyOptions.setFeatures(features);
        Modify modify = OLFactory.createModify(modifyOptions);

        map.addInteraction(modify);
    }

}
