package nl.hz.ict.loof0026.oopdraw.composer;

import nl.hz.ict.loof0026.oopdraw.shape.AbstractShape;
import nl.hz.ict.loof0026.oopdraw.shape.Oval;

import java.awt.*;

/**
 * This class describes an oval composer
 * @author Raymon de Looff
 */
public class OvalComposer extends ShapeComposer {

    @Override
    public AbstractShape create(Point point) {
        shape = new Oval();
        shape.setStartPoint(point);

        return shape;
    }

}
