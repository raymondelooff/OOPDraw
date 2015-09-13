package shape;

import java.awt.*;

/**
 *  This class describes an line
 *  @author Raymon de Looff
 */
public class Line extends Shape {

	public Line(Color color) {
		super(color);
	}

	@Override
	public void Draw(Graphics2D graphics) {
		super.Draw(graphics);

		// Draw the line
		graphics.drawLine(startPosition.x, startPosition.y, endPosition.x, endPosition.y);
	}

}
