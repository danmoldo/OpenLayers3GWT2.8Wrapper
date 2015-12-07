package today.learnjava.ol3.demo.examples;

import ol.*;
import ol.control.Attribution;

import ol.geom.Point;
import ol.layer.Tile;
import ol.source.*;
import ol.layer.LayerOptions;
import ol.style.*;
import ol.MapOptions;

/**
 * @author Dan Moldovan
 */
public class ClusteringExample implements Example {

    public void show() {

        // create a MapQuest-layer
        LayerOptions mapQuestLayerOptions = OLFactory.createLayerOptions();
        
        MapQuestOptions mapQuestOptions = OLFactory.createMapQuestOptions();
        mapQuestOptions.setLayer("hyb");

        MapQuest mapQuestSource = OLFactory.createMapQuestSource(mapQuestOptions);

        mapQuestLayerOptions.setSource(mapQuestSource);

        Tile mapQuestLayer = OLFactory.createTileLayer(mapQuestLayerOptions);

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
        mapOptions.setTarget("mapClustering");
        mapOptions.setView(view);

        Map map = OLFactory.createMap(mapOptions);

        stamenLayer.setOpacity(0.5f);
        map.addLayer(mapQuestLayer);

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



        int count = 1000;
        Feature[] features = new Feature[count];
        int e = 4500000;

        for (int i = 0; i < count; ++i) {
            double[] coordinates = OLFactory.createCoordinate(2 * e * Math.random() - e, 2 * e * Math.random() - e);

            Point point = OLFactory.createPoint(coordinates);

            Feature feature = OLFactory.createFeature();
            feature.setGeometry(point);
            features[i] = feature;
        }

        map.getLayers().push(stamenLayer);

        VectorOptions vectorOptions = OLFactory.createVectorSourceOptions();
        vectorOptions.setFeatures(features);
        ol.source.Vector vectorSource = OLFactory.createVectorSource(vectorOptions);




        ClusterOptions clusterOptions = OLFactory.createClusterOptions();
        clusterOptions.setDistance((double) 40);
        clusterOptions.setSource(vectorSource);


        Cluster clusterSource = OLFactory.createClusterSource(clusterOptions);



        ol.layer.VectorOptions vectorLayerOptions = OLFactory.createVectorLayerOptions();




        vectorLayerOptions.setStyle(new StyleFunction() {
            public void exec(Feature feature, int resolution) {
                int size = ((Feature[])feature.get("features")).length;


                StyleOptions styleOptions = OLFactory.createStyleOptions();
                CircleOptions circleOptions = OLFactory.createCircleOptions();
                circleOptions.setRadius(10);
                StrokeOptions strokeOptions = OLFactory.createStrokeOptions();
                strokeOptions.setColor("#3399CC");
                Stroke stroke = OLFactory.createStrokeStyle(strokeOptions);
                circleOptions.setStroke(stroke);
                FillOptions fillOptions = OLFactory.createFillOptions();
                fillOptions.setColor("#3399CC");
                Fill fill = OLFactory.createFill(fillOptions);
                circleOptions.setFill(fill);
                Circle circle = OLFactory.createCircle(circleOptions);
                ol.style.Image image = circle;
                styleOptions.setImage(image);

                TextOptions textOptions = OLFactory.createTextOptions();
                textOptions.setText("" + size);
                ol.style.Text text = OLFactory.createText(textOptions);
                styleOptions.setText(text);
                feature.setStyle(OLFactory.createStyle(styleOptions));
            }
        });

        ol.layer.Vector vectorLayer = OLFactory.createVectorLayer(vectorLayerOptions);

        vectorLayer.setSource(clusterSource);

        map.addLayer(vectorLayer);

    }
    
}

