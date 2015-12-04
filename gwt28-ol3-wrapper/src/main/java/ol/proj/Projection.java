package ol.proj;

import jsinterop.annotations.JsType;
import ol.Coordinate;

/**
 * 
 * @author DanMo
 *
 */
@JsType(isNative = true)
public abstract class Projection {
    
	public static native Projection getProjection(ProjectionOptions projectionOptions);
	
	public static native void addProjection(Projection projection);
	
	public static native Projection get(String projectionCode);


	public static native Coordinate transform(Coordinate coordinate, String source, String destination);
	
	public static native double[] transformExtent(double[] extent, String source, String destination);
	
    public abstract String getCode();
    
    public abstract double[] getExtent();
    
    public abstract void setExtent(double[] extent);
    
    public abstract double getMetersPerUnit();
    
    public abstract String getUnits();
    
    public abstract boolean isGlobal();

}

