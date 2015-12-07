package olx.source;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import ol.proj.Projection;

/**
 * @author DanMo
 */
@JsType(isNative = true)
public interface ImageStaticOptions extends SourceOptions {
    
    @JsMethod
    void setCrossOrigin(String crossOrigin);
    
    @JsMethod
    void setImageExtent(double[] extent);

    @JsMethod
    void setImageSize(int[] imageSize);

    @JsMethod
    void setProjection(Projection projection);

    /**
     * @param url URL to image
     */
    @JsMethod
    void setUrl(String url);

}
