package shape;

import java.awt.*;

/**
 * This class describes a rectangle
 * @author Raymon de Looff
 */
public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	public void Draw(Graphics2D graphics) {
		super.Draw(graphics);

		// Draw the rectangle
		graphics.drawRect(startPosition.x, startPosition.y, width, height);
	}

}
