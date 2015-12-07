package olx;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import ol.Collection;
import ol.Overlay;
import ol.View;
import ol.control.Control;
import ol.interaction.Interaction;
import ol.layer.Base;

/**
 * Options for the map.
 * 
 * @author Dan Moldovan
 *
 */
@JsType(isNative = true)
public interface MapOptions {

    @JsProperty
    void setControls(Collection<Control> controls);

    @JsProperty
    void setInteractions(Collection<Interaction> interactions);

    @JsProperty
    void setLayers(Collection<Base> layers);

    @JsProperty
    void setLogo(LogoOptions logo);

    @JsProperty
    void setOverlays(Collection<Overlay> overlays);

    @JsProperty
    void setRenderer(String rendererType);

    @JsProperty
    void setTarget(String target);

    @JsProperty
    void setView(View view);
    
}

