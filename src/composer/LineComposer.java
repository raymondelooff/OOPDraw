package composer;

import shape.AbstractShape;
import shape.Line;

import java.awt.*;

/**
 * This class describes a line composer
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
	public void expand(Point point) {
		shape.setEndPoint(point);
	}

	@Override
	public void complete(Point point) {
		expand(point);
	}

}
