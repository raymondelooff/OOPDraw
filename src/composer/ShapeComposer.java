package composer;

import java.awt.Point;

import shape.Shape;

/**
 * This interface describes a shape composer
 * @author Raymon de Looff
 */
public abstract class ShapeComposer {

	protected Shape shape;
	private Point originalStartPosition;
	
	public void create(Point point) {
		originalStartPosition = point;
	}
	
	public void expand(Point point) {
		Point newStartPosition = new Point(Math.min(point.x, originalStartPosition.x), Math.min(point.y, originalStartPosition.y));
		Point drawToPosition = new Point(Math.max(point.x, originalStartPosition.x), Math.max(point.y, originalStartPosition.y));

		int newWidth = Math.abs((drawToPosition.x - newStartPosition.x));
		int newHeight = Math.abs((drawToPosition.y - newStartPosition.y));

		shape.setStartPosition(newStartPosition);
		shape.setWidth(newWidth);
		shape.setHeight(newHeight);
	}
	
	public void complete(Point point) {
		shape.setEndPosition(point);
	}

	public Shape getShape() {
		return shape;
	}

}
