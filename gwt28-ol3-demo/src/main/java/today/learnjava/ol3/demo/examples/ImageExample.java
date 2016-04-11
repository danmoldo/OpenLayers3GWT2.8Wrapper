package today.learnjava.ol3.demo.examples;

import ol.*;
import ol.control.Attribution;
import ol.layer.Heatmap;
import ol.layer.Image;
import ol.layer.Tile;
import ol.proj.Projection;
import ol.source.*;
import olx.AttributionOptions;
import olx.MapOptions;
import olx.ViewOptions;
import olx.format.KMLOptions;
import olx.layer.ImageOptions;
import olx.layer.LayerOptions;
import olx.proj.ProjectionOptions;
import olx.source.*;

/**
 * @author Dan Moldovan
 */
public class ImageExample implements Example {

    public void show() {

        Extent extent = OLFactory.createExtent(0, 0, 1024, 968);

        ProjectionOptions projectionOptions = OLFactory.createOptions();
        projectionOptions.setCode("xkcd-image");
        projectionOptions.setExtent(extent);
        projectionOptions.setUnits("pixels");
        Projection projection = OLFactory.createProjection(projectionOptions);

        // create a view
        ViewOptions viewOptions = OLFactory.createOptions();
        viewOptions.setProjection(projection);
        viewOptions.setMaxZoom(8);
        View view = OLFactory.createView(viewOptions);
        Coordinate centerCoordinate = Util.getCenterOfExtent(OLFactory.createExtent(0, 0, 1024, 968));

        view.setCenter(centerCoordinate);
        view.setZoom(2);

        // create the map
        MapOptions mapOptions = OLFactory.createOptions();
        mapOptions.setTarget("mapImage");
        mapOptions.setView(view);
        Map map = OLFactory.createMap(mapOptions);

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
//        map.addLayer(mapQuestLayer);

        ImageOptions imageLayerOptions = OLFactory.createOptions();
        ImageStaticOptions imageStaticOptions = OLFactory.createOptions();
        imageStaticOptions.setUrl("http://imgs.xkcd.com/comics/online_communities.png");

        imageStaticOptions.setProjection(projection);
        imageStaticOptions.setImageExtent(OLFactory.createExtent(0, 0, 1024, 968));
        ol.Attribution[] attributions = new ol.Attribution[1];
        AttributionOptions attributionOptions = OLFactory.createOptions();
        attributionOptions.setHtml("&copy; <a href=\"http://xkcd.com/license.html\">xkcd</a>");
        ol.Attribution attribution = OLFactory.createAttributions(attributionOptions);
        attributions[0] = attribution;
        imageStaticOptions.setAttributions(attributions);
        ImageStatic imageStatic = OLFactory.createImageStaticSource(imageStaticOptions);
        imageLayerOptions.setSource(imageStatic);
        Image imageLayer = OLFactory.createImageLayer((LayerOptions) imageLayerOptions);

        map.addLayer(imageLayer);
    }

}
