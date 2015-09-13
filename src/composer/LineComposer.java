package composer;

import shape.Line;
import shape.Shape;

import java.awt.*;

/**
 * 
 * @author Raymon de Looff
 */
public class LineComposer extends ShapeComposer {

	@Override
	public void create(Point point) {
		super.create(point);

		shape = new Line(Color.BLUE);
		shape.setStartPosition(point);
	}

	@Override
	public void expand(Point point) {
		shape.setEndPosition(point);
	}

}
