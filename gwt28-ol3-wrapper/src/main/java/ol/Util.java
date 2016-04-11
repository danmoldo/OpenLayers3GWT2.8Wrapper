package ol;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.Event;

/**
 * @author Dan Moldovan
 */
public class Util {

    public static native Coordinate toLonLat(Coordinate coordinate)  /*-{
        return $wnd.ol.proj.toLonLat(coordinate);
    }-*/;

    public static native String toStringXY(Coordinate coordinate)  /*-{
        return $wnd.ol.coordinate.toStringXY(coordinate);
    }-*/;

    public static native String toStringHDMS(Coordinate coordinate)  /*-{
        return $wnd.ol.coordinate.toStringHDMS(coordinate);
    }-*/;

    public static native Coordinate getCenterOfExtent(Extent extent)  /*-{
        return $wnd.ol.extent.getCenter(extent);
    }-*/;

    public static native void showPopup(Overlay popup, Coordinate coordinate) /*-{
        var element = popup.getElement();
        var coordinate = coordinate;
        $wnd.$(element).popover('destroy');

        popup.setPosition(coordinate);

        // the keys are quoted to prevent renaming in ADVANCED mode.
        $wnd.$(element).popover({
            'placement': 'top',
            'animation': false,
            'html': true,
            'content': '<p>The location you clicked was:</p><code>' + $wnd.ol.coordinate.toStringHDMS($wnd.ol.proj.toLonLat(coordinate)) + '</code>'
        });

        $wnd.$(element).popover('show');

    }-*/;


}
