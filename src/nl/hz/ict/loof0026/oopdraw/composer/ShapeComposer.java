package nl.hz.ict.loof0026.oopdraw.composer;

import java.awt.Point;

import nl.hz.ict.loof0026.oopdraw.shape.AbstractShape;

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
