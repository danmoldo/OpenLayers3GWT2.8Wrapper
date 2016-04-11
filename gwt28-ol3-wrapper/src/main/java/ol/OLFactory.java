package ol;

import ol.control.FullScreen;
import ol.control.MousePosition;
import ol.control.Rotate;
import ol.control.ScaleLine;
import ol.control.ZoomSlider;
import ol.control.ZoomToExtent;
import ol.geom.*;
import ol.interaction.*;
import ol.layer.Heatmap;
import ol.layer.Image;
import ol.layer.Tile;
import ol.proj.Projection;
import olx.AttributionOptions;
import olx.MapOptions;
import olx.OverlayOptions;
import olx.ViewOptions;
import olx.format.KMLOptions;
import olx.interaction.DrawOptions;
import olx.interaction.ModifyOptions;
import olx.proj.ProjectionOptions;
import ol.source.*;
import olx.source.*;
import ol.style.*;
import ol.style.Circle;
import olx.style.*;
import olx.interaction.TranslateOptions;
import olx.layer.LayerOptions;

/**
 * @author Dan Moldovan
 */
public class OLFactory {

    /** Controls **/

    public static native ol.control.Attribution createAttributionControl() /*-{
        return new $wnd.ol.control.Attribution();
    }-*/;

    public static native FullScreen createFullScreenControl() /*-{
        return new $wnd.ol.control.FullScreen();
    }-*/;

    public static native MousePosition createMousePositionControl() /*-{
        return new $wnd.ol.control.MousePosition();
    }-*/;

    public static native Rotate createRotateControl() /*-{
        return new $wnd.ol.control.Rotate();
    }-*/;

    public static native ScaleLine createScaleLineControl() /*-{
        return new $wnd.ol.control.ScaleLine();
    }-*/;

    public static native ZoomSlider createZoomSliderControl() /*-{
        return new $wnd.ol.control.ZoomSlider();
    }-*/;

    public static native ZoomToExtent createZoomToExtentControl() /*-{
        return new $wnd.ol.control.ZoomToExtent();
    }-*/;

    /** Formats **/

    public static native ol.format.GeoJSON createGeoJSONFormat() /*-{
        return new $wnd.ol.format.GeoJSON();
    }-*/;

    public static native ol.format.KML createKMLFormat(KMLOptions kmlOptions) /*-{
        return new $wnd.ol.format.KML(kmlOptions);
    }-*/;

    /** Geom **/

    public static native Point createPointGeom(double[] coordinates) /*-{
        return new $wnd.ol.geom.Point(coordinates);
    }-*/;

    public static native ol.geom.Circle createCircleGeom(double[] coordinates) /*-{
        return new $wnd.ol.geom.Circle(coordinates);
    }-*/;

    /** Interactions **/

    public static native DragAndDrop createDragAndDrop() /*-{
        return new $wnd.ol.interaction.DragAndDrop();
    }-*/;

    public static native Draw createDraw(DrawOptions drawOptions) /*-{
        return new $wnd.ol.interaction.Draw(drawOptions);
    }-*/;

    public static native KeyboardPan createKeyboardPan() /*-{
        return new $wnd.ol.interaction.KeyboardPan();
    }-*/;

    public static native KeyboardZoom createKeyboardZoom() /*-{
        return new $wnd.ol.interaction.KeyboardZoom();
    }-*/;

    public static native Modify createModify(ModifyOptions modifyOptions) /*-{
        return new $wnd.ol.interaction.Modify(modifyOptions);
    }-*/;

    public static native ol.interaction.Select createSelectInteraction() /*-{
        return new $wnd.ol.interaction.Select();
    }-*/;

    public static native ol.interaction.Translate createTranslateInteraction(TranslateOptions translateOptions) /*-{
        return new $wnd.ol.interaction.Translate(translateOptions);
    }-*/;

    /** Layers **/

    public static native Heatmap createHeatmapLayer(LayerOptions layerOptions) /*-{
        return new $wnd.ol.layer.Heatmap(layerOptions);
    }-*/;

    public static native Image createImageLayer(LayerOptions layerOptions) /*-{
        return new $wnd.ol.layer.Image(layerOptions);
    }-*/;

    public static native Tile createTileLayer(LayerOptions layerOptions) /*-{
        return new $wnd.ol.layer.Tile(layerOptions);
    }-*/;

    public static native ol.layer.Vector createVectorLayer(olx.layer.VectorOptions vectorOptions) /*-{
        return new $wnd.ol.layer.Vector(vectorOptions);
    }-*/;

    /** Sources **/

    public static native ImageStatic createImageStaticSource(ImageStaticOptions imageStaticOptions) /*-{
        return new $wnd.ol.source.ImageStatic(imageStaticOptions);
    }-*/;

    public static native ImageWMS createImageWMSSource(ImageWMSOptions imageWMSOptions) /*-{
        return new $wnd.ol.source.ImageWMS(imageWMSOptions);
    }-*/;

    public static native MapQuest createMapQuestSource(MapQuestOptions mapQuestOptions) /*-{
        return new $wnd.ol.source.MapQuest(mapQuestOptions);
    }-*/;

    public static native Stamen createStamenSource(StamenOptions stamenOptions) /*-{
        return new $wnd.ol.source.Stamen(stamenOptions);
    }-*/;

    public static native Xyz createXyz(XyzOptions xyzOptions) /*-{
        return new $wnd.ol.source.XYZ(xyzOptions);
    }-*/;

    public static native BingMaps createBingMaps(BingMapsOptions bingMapsOptions) /*-{
        return new $wnd.ol.source.BingMaps(bingMapsOptions);
    }-*/;

    public static native ol.source.Vector createVectorSource(VectorOptions vectorOptions) /*-{
        return new $wnd.ol.source.Vector(vectorOptions);
    }-*/;

    public static native ol.source.Cluster createClusterSource(ClusterOptions clusterOptions) /*-{
        return new $wnd.ol.source.Cluster(clusterOptions);
    }-*/;

    public static native TileDebug createTileDebug(TileDebugOptions tileDebugOptions) /*-{
        return new $wnd.ol.source.TileDebug(tileDebugOptions);
    }-*/;

    public static native Osm createOsm(XyzOptions osmOptions) /*-{
        return new $wnd.ol.source.OSM(osmOptions);
    }-*/;

    /** Projection **/

    public static native Projection createProjection(ProjectionOptions projectionOptions) /*-{
        return new $wnd.ol.proj.Projection(projectionOptions);
    }-*/;

    /** Style **/
    public static native Circle createCircle(CircleOptions circleOptions) /*-{
        return new $wnd.ol.style.Circle(circleOptions);
    }-*/;

    public static native Fill createFill(FillOptions fillOptions) /*-{
        return new $wnd.ol.style.Fill(fillOptions);
    }-*/;

    public static native ol.style.Image createImageStyle(ImageOptions imageOptions) /*-{
        return new $wnd.ol.style.Image(imageOptions);
    }-*/;

    public static native ol.style.Stroke createStrokeStyle(StrokeOptions strokeOptions) /*-{
        return new $wnd.ol.style.Stroke(strokeOptions);
    }-*/;

    public static native Style createStyle(StyleOptions styleOptions) /*-{
        return new $wnd.ol.style.Style(styleOptions);
    }-*/;

    public static native Text createText(TextOptions textOptions) /*-{
        return new $wnd.ol.style.Text(textOptions);
    }-*/;

    public static native ol.style.StyleFunction createStyleFunction() /*-{
        return new $wnd.ol.style.StyleFunction();
    }-*/;

    /** Main objects **/

    public static native Attribution createAttributions(AttributionOptions attributionOptions) /*-{
        return new $wnd.ol.Attribution(attributionOptions);
    }-*/;

    public static native Graticule createGraticule() /*-{
        return new $wnd.ol.Graticule();
    }-*/;

    public static native Map createMap(MapOptions mapOptions) /*-{
        return new $wnd.ol.Map(mapOptions);
    }-*/;

    public static native View createView() /*-{
        return new $wnd.ol.View();
    }-*/;

    public static native View createView(ViewOptions viewOptions) /*-{
        return new $wnd.ol.View(viewOptions);
    }-*/;

    public static native Feature createFeature() /*-{
        return new $wnd.ol.Feature();
    }-*/;

    public static native ol.Overlay createOverlay(OverlayOptions overlayOptions) /*-{
        return new $wnd.ol.Overlay(overlayOptions);
    }-*/;

    /** Utils **/

    public static native <T> T createOptions() /*-{
        return {};
    }-*/;

    public static native <T> T createParams() /*-{
        return {};
    }-*/;

    public static native <T> Collection<T> createCollection() /*-{
        return new $wnd.ol.Collection();
    }-*/;

    public static double[] createCoordinate(double... coordParams) {
        return coordParams;
    };

    public static native Coordinate createCoordinateFromLonLat(double x, double y)  /*-{
        return new $wnd.ol.proj.fromLonLat([x,y]);
    }-*/;

    public static native Extent createExtent(double minX, double minY, double maxX, double maxY) /*-{
        return [minX, minY, maxX, maxY];
    }-*/;

    public static native int[] createSize(int width, int height) /*-{
        return [width, height];
    }-*/;

}
