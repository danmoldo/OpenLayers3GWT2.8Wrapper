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
    HeatmapExample(new HeatmapExample()),
    OsmExample(new OsmExample());

    private Example example;
    
    private ExampleFactory(Example example) {
        this.example = example;
    }
    
    public Example getExample() {
        return this.example;
    }
    
}

