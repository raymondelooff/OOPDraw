package nl.hz.ict.loof0026.oopdraw.composer;

import nl.hz.ict.loof0026.oopdraw.shape.AbstractShape;
import nl.hz.ict.loof0026.oopdraw.shape.Line;

import java.awt.*;

/**
 * This class describes a line composer
 * @author Raymon de Looff
 */
public class LineComposer implements ShapeComposer {

	private Line shape;

	@Override
	public AbstractShape create(Point point) {
		shape = new Line();
		shape.setStartPoint(point);

		return shape;
	}

	@Override
	public void expand(Point point) {
		shape.setEndPoint(point);
	}

	@Override
	public void complete(Point point) {
		expand(point);
	}

}
