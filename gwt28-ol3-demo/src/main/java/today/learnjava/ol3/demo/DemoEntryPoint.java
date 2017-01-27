package today.learnjava.ol3.demo;

import com.google.gwt.core.client.EntryPoint;
import today.learnjava.ol3.demo.examples.Example;

/**
 * @author Dan Moldovan
 */
public class DemoEntryPoint implements EntryPoint {

    public void onModuleLoad() {

        ExampleFactory.ImageExample.getExample().show();
        ExampleFactory.BingMapsExample.getExample().show();
        ExampleFactory.OverlayExample.getExample().show();
        ExampleFactory.OsmExample.getExample().show();
        ExampleFactory.ClusteringExample.getExample().show();
        ExampleFactory.DragAndDropShapesExample.getExample().show();
        ExampleFactory.HeatmapExample.getExample().show();
        ExampleFactory.CountryVectorLayerExample.getExample().show();
        ExampleFactory.DrawModifyFeaturesExample.getExample().show();
        ExampleFactory.CustomDropdownExample.getExample().show();
        ExampleFactory.TextStylesExample.getExample().show();


    }
    
}
