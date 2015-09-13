package composer;

import shape.Line;
import shape.Shape;

import java.awt.*;

/**
 * 
 * @author Raymon de Looff
 */
public class LineComposer implements ShapeComposer {

	private Line line;

	@Override
	public void create(Point point) {
		line = new Line(Color.BLUE);
		line.setStartPosition(point);
	}

	@Override
	public void expand(Point point) {
		line.setEndPosition(point);
	}

	@Override
	public void complete(Point point) {
		line.setEndPosition(point);
	}

	@Override
	public Shape getShape() {
		return line;
	}

}
