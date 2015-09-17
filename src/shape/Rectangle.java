package shape;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * This class describes a rectangle
 * @author Raymon de Looff
 */
public class Rectangle extends AbstractShape {

	private Rectangle2D rectangle;

	public Rectangle() {
		rectangle = new Rectangle2D.Double();
		color = Color.ORANGE;
	}

	@Override
	public void updateShape() {
		rectangle.setFrameFromDiagonal(startPoint, endPoint);
	}

	@Override
	public void Draw(Graphics2D graphics) {
		super.Draw(graphics);

		// Draw the rectangle
		graphics.draw(rectangle);
	}

}
