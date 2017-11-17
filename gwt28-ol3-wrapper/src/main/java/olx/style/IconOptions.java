package olx.style;

import com.google.gwt.user.client.ui.Image;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Created by Dan Moldovan on 16.11.2017.
 */
@JsType(isNative = true)
public interface IconOptions {

    @JsProperty
    void setAnchor(double[] anchor);

    @JsProperty
    void setImg(Image image);

    @JsProperty
    void setOpacity(double opacity);

    @JsProperty
    void setScale(double scale);

    @JsProperty
    void setRotateWithView(boolean rotateWithView);

    @JsProperty
    void setImgSize(double[] imgSize);

}
