package nl.hz.ict.loof0026.oopdraw.composer;

import java.awt.Point;

import nl.hz.ict.loof0026.oopdraw.shape.AbstractShape;

/**
 * This interface describes a shape composer
 * @author Raymon de Looff
 */
public interface ShapeComposer {
	
	public AbstractShape create(Point point);
	
	public void expand(Point point);
	
	public void complete(Point point);

}
