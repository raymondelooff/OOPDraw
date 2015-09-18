package composer;

import java.awt.Point;

import shape.AbstractShape;

/**
 * This interface describes a shape composer
 * @author Raymon de Looff
 */
public abstract class ShapeComposer {

	protected AbstractShape shape;
	
	public abstract AbstractShape create(Point point);
	
	public void expand(Point point) {
		shape.setEndPoint(point);
	}
	
	public void complete(Point point) {
		expand(point);
	}

}
