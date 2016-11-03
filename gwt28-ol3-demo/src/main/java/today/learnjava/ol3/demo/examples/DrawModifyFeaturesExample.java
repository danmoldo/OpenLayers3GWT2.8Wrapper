package today.learnjava.ol3.demo.examples;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.SelectElement;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;
import ol.*;
import ol.interaction.Draw;
import ol.interaction.Modify;
import ol.layer.Tile;
import ol.layer.Vector;
import ol.source.Stamen;
import olx.MapOptions;
import olx.interaction.DrawOptions;
import olx.interaction.ModifyOptions;
import olx.layer.LayerOptions;
import olx.layer.VectorOptions;
import olx.source.StamenOptions;

/**
 * @author Dan Moldovan
 */
public class DrawModifyFeaturesExample implements Example {

    static Draw draw;

    public void show() {

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
        final Map map = OLFactory.createMap(mapOptions);

        map.addLayer(stamenLayer);

        map.setView(view);
        map.setTarget("mapDrawModifyFeatures");

        map.addControl(OLFactory.createScaleLineControl());
        map.addControl(OLFactory.createFullScreenControl());
        map.addControl(OLFactory.createZoomSliderControl());
        map.addControl(OLFactory.createMousePositionControl());
        map.addControl(OLFactory.createZoomToExtentControl());

        final Collection<Feature> features = OLFactory.createCollection();
        VectorOptions featureOverlayOptions = OLFactory.createOptions();
        olx.source.VectorOptions vectorSourceOptions = OLFactory.createOptions();
        vectorSourceOptions.setFeatures(features);
        ol.source.Vector vectorSource = OLFactory.createVectorSource(vectorSourceOptions);
        featureOverlayOptions.setSource(vectorSource);
        Vector featureOverlay = OLFactory.createVectorLayer(featureOverlayOptions);

        map.addLayer(featureOverlay);

        DrawOptions drawOptions = OLFactory.createOptions();
        drawOptions.setFeatures(features);
        drawOptions.setType("Point");
        draw = OLFactory.createDraw(drawOptions);

        map.addInteraction(draw);

        ModifyOptions modifyOptions = OLFactory.createOptions();
        modifyOptions.setFeatures(features);
        Modify modify = OLFactory.createModify(modifyOptions);

        map.addInteraction(modify);

        final Element geometryType = Document.get().getElementById("geometryType");
        if (geometryType != null) {
            Event.sinkEvents(geometryType, Event.ONCHANGE);
            Event.setEventListener(geometryType, new EventListener() {
                public void onBrowserEvent(Event event) {
                    map.removeInteraction(draw);
                    SelectElement geometryType = SelectElement.as(Document.get().getElementById("geometryType"));
                    DrawOptions drawOptions = OLFactory.createOptions();
                    drawOptions.setFeatures(features);
                    drawOptions.setType(geometryType.getValue());
                    draw = OLFactory.createDraw(drawOptions);
                    map.addInteraction(draw);
                }
            });
        }
    }

}
