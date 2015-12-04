package today.learnjava.ol3.demo;

import com.google.gwt.core.client.EntryPoint;

/**
 *
 * @author DanMo
 *
 */
public class DemoEntryPoint implements EntryPoint {

    public void onModuleLoad() {

        ExampleFactory.BingMapsExample.getExample().show();
        ExampleFactory.OverlayExample.getExample().show();
        ExampleFactory.OsmExample.getExample().show();
        ExampleFactory.ClusteringExample.getExample().show();
        ExampleFactory.DragAndDropShapesExample.getExample().show();

    }
    
}
