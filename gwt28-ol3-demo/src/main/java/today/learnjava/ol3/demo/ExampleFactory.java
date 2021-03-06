package today.learnjava.ol3.demo;

import today.learnjava.ol3.demo.examples.*;

/**
 * @author Dan Moldovan
 */
public enum ExampleFactory {

    ClusteringExample(new ClusteringExample()),
    OverlayExample(new OverlayExample()),
    BingMapsExample(new BingMapsExample()),
    DragAndDropShapesExample(new DragAndDropShapesExample()),
    DrawModifyFeaturesExample(new DrawModifyFeaturesExample()),
    HeatmapExample(new HeatmapExample()),
    CountryVectorLayerExample(new CountryVectorLayerExample()),
    OsmExample(new OsmExample()),
    TextStylesExample(new TextStylesExample()),
    ImageExample(new ImageExample()),
    CustomDropdownExample(new CustomDropdownExample());

    private Example example;
    
    private ExampleFactory(Example example) {
        this.example = example;
    }
    
    public Example getExample() {
        return this.example;
    }
    
}

