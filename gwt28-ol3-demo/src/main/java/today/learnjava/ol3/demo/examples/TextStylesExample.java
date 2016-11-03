package today.learnjava.ol3.demo.examples;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.dom.client.SelectElement;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;
import ol.*;
import ol.interaction.Draw;
import ol.interaction.Modify;
import ol.layer.Tile;
import ol.layer.Vector;
import ol.source.Stamen;
import ol.style.*;
import olx.MapOptions;
import olx.interaction.DrawOptions;
import olx.interaction.ModifyOptions;
import olx.layer.LayerOptions;
import olx.layer.VectorOptions;
import olx.source.StamenOptions;
import olx.style.FillOptions;
import olx.style.StrokeOptions;
import olx.style.StyleOptions;
import olx.style.TextOptions;

/**
 * @author Dan Moldovan
 */
public class TextStylesExample implements Example {

    private Style style = null;
    private StyleOptions styleOptions = null;
    private TextOptions textOptions = null;
    private Text text = null;
    private Vector featureOverlay = null;

    public void show() {

        // create a Stamen-layer
        LayerOptions stamenLayerOptions = OLFactory.createOptions();

        StamenOptions stamenOptions = OLFactory.createOptions();
        stamenOptions.setLayer("watercolor");
        Stamen stamenSource = OLFactory.createStamenSource(stamenOptions);
        stamenLayerOptions.setSource(stamenSource);
        Tile stamenLayer = OLFactory.createTileLayer(stamenLayerOptions);


        // create a view
        View view = OLFactory.createView();

        Coordinate centerCoordinate = OLFactory.createCoordinateFromLonLat(16.3725, 48.208889);

        view.setCenter(centerCoordinate);
        view.setZoom(5);

        // create the map
        MapOptions mapOptions = OLFactory.createOptions();
        mapOptions.setTarget("mapTextStyles");
        mapOptions.setView(view);

        final Map map = OLFactory.createMap(mapOptions);

        stamenLayer.setOpacity(0.5f);
        map.addLayer(stamenLayer);


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

        final Collection<Feature> features = OLFactory.createCollection();
        VectorOptions featureOverlayOptions = OLFactory.createOptions();
        olx.source.VectorOptions vectorSourceOptions = OLFactory.createOptions();
        vectorSourceOptions.setFeatures(features);
        ol.source.Vector vectorSource = OLFactory.createVectorSource(vectorSourceOptions);
        featureOverlayOptions.setSource(vectorSource);


        styleOptions = OLFactory.createOptions();
        textOptions = OLFactory.createOptions();
        textOptions.setText("Hello");
        textOptions.setScale(10);
        text = OLFactory.createText(textOptions);
        styleOptions.setText(text);
        style = OLFactory.createStyle(styleOptions);


        featureOverlayOptions.setStyle(new StyleFunction() {
            public Style exec(Feature feature, int resolution) {
                feature.setStyle(style);
                return style;
            }
        });

        featureOverlay = OLFactory.createVectorLayer(featureOverlayOptions);

        map.addLayer(featureOverlay);

        DrawOptions drawOptions = OLFactory.createOptions();
        drawOptions.setFeatures(features);
        drawOptions.setType("Point");
        Draw draw = OLFactory.createDraw(drawOptions);

        map.addInteraction(draw);

        ModifyOptions modifyOptions = OLFactory.createOptions();
        modifyOptions.setFeatures(features);
        Modify modify = OLFactory.createModify(modifyOptions);

        map.addInteraction(modify);

        final Element textSize = Document.get().getElementById("refresh-text");

        Event.sinkEvents(textSize, Event.ONCLICK);
        Event.setEventListener(textSize, new EventListener() {
            public void onBrowserEvent(Event event) {
                map.removeLayer(featureOverlay);
                styleOptions = OLFactory.createOptions();
                textOptions = OLFactory.createOptions();
                InputElement input = InputElement.as(Document.get().getElementById("text-label"));
                if (input != null) {
                    textOptions.setText(input.getValue());
                }
                else {
                    textOptions.setText("Hello");
                }

                input = InputElement.as(Document.get().getElementById("text-size"));
                if (input != null) {
                    textOptions.setScale(Integer.parseInt(input.getValue()));
                }
                else {
                    textOptions.setScale(10);
                }


                SelectElement select = SelectElement.as(Document.get().getElementById("text-font"));
                if (select != null) {
                    textOptions.setFont("normal " + input.getValue() + "px \"" + select.getValue() + "\"");
                }
                else {
                    textOptions.setFont("normal 20px \"Verdana\"");
                }

                select = SelectElement.as(Document.get().getElementById("text-align"));
                if (select != null) {
                    textOptions.setTextAlign(select.getValue());
                }
                else {
                    textOptions.setTextAlign("center");
                }
                select = SelectElement.as(Document.get().getElementById("text-baseline"));
                if (select != null) {
                    textOptions.setTextBaseline(select.getValue());
                }
                else {
                    textOptions.setTextBaseline("middle");
                }
                select = SelectElement.as(Document.get().getElementById("text-rotation"));
                if (select != null) {
                    textOptions.setRotation(Double.parseDouble(select.getValue()));
                }
                input = InputElement.as(Document.get().getElementById("text-offset-x"));
                if (input != null) {
                    textOptions.setOffsetX(Integer.parseInt(input.getValue()));
                }
                input = InputElement.as(Document.get().getElementById("text-offset-y"));
                if (input != null) {
                    textOptions.setOffsetY(Integer.parseInt(input.getValue()));
                }
                input = InputElement.as(Document.get().getElementById("text-stroke-color"));
                if (input != null) {
                    StrokeOptions strokeOptions = OLFactory.createOptions();
                    strokeOptions.setColor(input.getValue());
                    Stroke stroke = OLFactory.createStrokeStyle(strokeOptions);
                    textOptions.setStroke(stroke);
                }
                input = InputElement.as(Document.get().getElementById("text-fill-color"));
                if (input != null) {
                    FillOptions fillOptions = OLFactory.createOptions();
                    fillOptions.setColor(input.getValue());
                    Fill fill = OLFactory.createFill(fillOptions);
                    textOptions.setFill(fill);
                }
                text = OLFactory.createText(textOptions);
                styleOptions.setText(text);
                style = OLFactory.createStyle(styleOptions);

                for (Feature feature : features.getArray()) {
                    feature.setStyle(style);
                }

                map.addLayer(featureOverlay);
            }
        });


    }
}
