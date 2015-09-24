package nl.hz.ict.loof0026.oopdraw.shape;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 *  This class describes an line
 *  @author Raymon de Looff
 */
public class Line extends AbstractShape {

	private Line2D.Double line;

	public Line() {
		line = new Line2D.Double();
		color = Color.BLUE;
	}

	@Override
	public void updateShape() {
		line.setLine(startPoint, endPoint);
	}

	@Override
	public void Draw(Graphics2D graphics) {
		super.Draw(graphics);

		// Draw the line
		graphics.draw(line);
	}

}
