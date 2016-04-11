package olx.source;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import ol.Extent;
import ol.proj.Projection;

/**
 * @author Dan Moldovan
 */
@JsType(isNative = true)
public interface ImageStaticOptions extends SourceOptions {
    
    @JsProperty
    void setCrossOrigin(String crossOrigin);
    
    @JsProperty
    void setImageExtent(Extent extent);

    @JsProperty
    void setImageSize(int[] imageSize);

    @JsProperty
    void setProjection(Projection projection);

    @JsProperty
    void setUrl(String url);

}
