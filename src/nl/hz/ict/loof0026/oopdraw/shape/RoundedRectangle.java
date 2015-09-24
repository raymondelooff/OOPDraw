package nl.hz.ict.loof0026.oopdraw.shape;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

/**
 * This class describes a rounded rectangle
 * @author Raymon de Looff
 */
public class RoundedRectangle extends AbstractShape {

    private RoundRectangle2D.Double roundRectangle;
    private static final Double cornerRadius = 0.5;

    public RoundedRectangle() {
        roundRectangle = new RoundRectangle2D.Double();
        color = Color.CYAN;
    }

    @Override
    public void updateShape() {
        roundRectangle.setFrameFromDiagonal(startPoint, endPoint);

        // Set the arc for the rounded borders
        roundRectangle.arcwidth = roundRectangle.getWidth() * cornerRadius;
        roundRectangle.archeight = roundRectangle.getHeight() * cornerRadius;
    }

    @Override
    public void Draw(Graphics2D graphics) {
        super.Draw(graphics);

        // Draw the rounded rectangle
        graphics.draw(roundRectangle);
    }

}
