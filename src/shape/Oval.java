package shape;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * This class describes an oval
 * @author Raymon de Looff
 */
public class Oval extends AbstractShape {

	private Ellipse2D.Double ellipse;

	public Oval() {
		ellipse = new Ellipse2D.Double();
		color = Color.RED;
	}

	@Override
	public void updateShape() {
		ellipse.setFrameFromDiagonal(startPoint, endPoint);
	}

	@Override
	public void Draw(Graphics2D graphics) {
		super.Draw(graphics);

		// Draw the shape
		graphics.draw(ellipse);
	}

}