package today.learnjava.ol3.demo.examples;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.Window;
import goog.events.Event;
import ol.*;
import ol.control.Attribution;
import ol.event.ListenerFunction;
import ol.functions.FeatureLayerFunction;
import ol.geom.Point;
import ol.layer.Layer;
import ol.layer.Tile;
import ol.source.Cluster;
import ol.source.Stamen;
import ol.style.*;
import olx.MapOptions;
import olx.layer.LayerOptions;
import olx.source.ClusterOptions;
import olx.source.StamenOptions;
import olx.source.VectorOptions;
import olx.style.*;

/**
 * @author Dan Moldovan
 */
public class ClusteringExample implements Example {

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
        mapOptions.setTarget("mapClustering");
        mapOptions.setView(view);

        final Map map = OLFactory.createMap(mapOptions);

        stamenLayer.setOpacity(0.5f);

        // add some controls
        map.addControl(OLFactory.createScaleLineControl());
        map.addControl(OLFactory.createFullScreenControl());
        map.addControl(OLFactory.createZoomSliderControl());
        map.addControl(OLFactory.createMousePositionControl());
        map.addControl(OLFactory.createZoomToExtentControl());
        map.addControl(OLFactory.createRotateControl());

        Attribution attribution = OLFactory.createAttributionControl();
        attribution.setCollapsed(true);

        map.addControl(attribution);

        // add some interactions
        map.addInteraction(OLFactory.createKeyboardPan());
        map.addInteraction(OLFactory.createKeyboardZoom());



        int count = 20000;
        Feature[] features = new Feature[count];
        int e = 18000000;

        for (int i = 0; i < count; ++i) {
            double[] coordinates = OLFactory.createCoordinate(2 * e * Math.random() - e, 2 * e * Math.random() - e);

            Point point = OLFactory.createPointGeom(coordinates);

            Feature feature = OLFactory.createFeature();
            feature.setGeometry(point);
            features[i] = feature;
        }

        map.getLayers().push(stamenLayer);

        VectorOptions vectorOptions = OLFactory.createOptions();
        vectorOptions.setFeatures(features);
        ol.source.Vector vectorSource = OLFactory.createVectorSource(vectorOptions);




        ClusterOptions clusterOptions = OLFactory.createOptions();
        clusterOptions.setDistance((double) 40);
        clusterOptions.setSource(vectorSource);


        Cluster clusterSource = OLFactory.createClusterSource(clusterOptions);



        olx.layer.VectorOptions vectorLayerOptions = OLFactory.createOptions();




        vectorLayerOptions.setStyle(new StyleFunction() {
            public Style exec(Feature feature, int resolution) {
                int size = ((Feature[])feature.get("features")).length;


                StyleOptions styleOptions = OLFactory.createOptions();
                CircleOptions circleOptions = OLFactory.createOptions();
                circleOptions.setRadius(10);
                StrokeOptions strokeOptions = OLFactory.createOptions();
                strokeOptions.setColor("#3399CC");
                Stroke stroke = OLFactory.createStrokeStyle(strokeOptions);
                circleOptions.setStroke(stroke);
                FillOptions fillOptions = OLFactory.createOptions();
                fillOptions.setColor("#3399CC");
                Fill fill = OLFactory.createFill(fillOptions);
                circleOptions.setFill(fill);
                Circle circle = OLFactory.createCircle(circleOptions);
                ol.style.Image image = circle;
                styleOptions.setImage(image);

                TextOptions textOptions = OLFactory.createOptions();
                textOptions.setText("" + size);
                ol.style.Text text = OLFactory.createText(textOptions);
                styleOptions.setText(text);
                Style style = OLFactory.createStyle(styleOptions);
                feature.setStyle(style);
                return style;
            }
        });

        ol.layer.Vector vectorLayer = OLFactory.createVectorLayer(vectorLayerOptions);

        vectorLayer.setSource(clusterSource);

        map.addLayer(vectorLayer);

    }
    
}

