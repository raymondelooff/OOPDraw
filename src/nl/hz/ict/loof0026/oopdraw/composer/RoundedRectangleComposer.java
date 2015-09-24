package nl.hz.ict.loof0026.oopdraw.composer;

import nl.hz.ict.loof0026.oopdraw.shape.AbstractShape;
import nl.hz.ict.loof0026.oopdraw.shape.RoundedRectangle;

import java.awt.*;

/**
 * This class describes a rounded rectangle composer
 * @author Raymon de Looff
 */
public class RoundedRectangleComposer extends ShapeComposer {

    @Override
    public AbstractShape create(Point point) {
        shape = new RoundedRectangle();
        shape.setStartPoint(point);

        return shape;
    }

}
