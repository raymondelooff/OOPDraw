package composer;

import shape.AbstractShape;
import shape.Line;

import java.awt.*;

/**
 * 
 * @author Raymon de Looff
 */
public class LineComposer extends ShapeComposer {

	@Override
	public AbstractShape create(Point point) {
		shape = new Line();
		shape.setStartPoint(point);

		return shape;
	}

	@Override
	public AbstractShape expand(Point point) {
		shape.setEndPoint(point);

		return shape;
	}

	@Override
	public AbstractShape complete(Point point) {
		return expand(point);
	}
}
