package composer;

import java.awt.Point;

import shape.Shape;

/**
 * This interface describes a shape composer
 * @author Raymon de Looff
 */
public interface ShapeComposer {
	
	public void create(Point point);
	
	public void expand(Point point);
	
	public void complete(Point point);

	public Shape getShape();

}
