package shape;

import java.awt.*;

/**
 *  This class describes an oval
 *  @author Raymon de Looff
 */
public class Oval extends Shape {

	public Oval(Color color) {
		super(color);
	}

	@Override
	public void Draw(Graphics2D graphics) {
		super.Draw(graphics);

		System.out.println("Width: " + getWidth());
		System.out.println("Height" + getHeight());

		// Draw the oval
		graphics.drawOval(startPosition.x, startPosition.y, getWidth(), getHeight());
	}

}
