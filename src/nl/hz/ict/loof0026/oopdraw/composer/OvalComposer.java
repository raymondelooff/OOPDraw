package nl.hz.ict.loof0026.oopdraw.composer;

import nl.hz.ict.loof0026.oopdraw.shape.AbstractShape;
import nl.hz.ict.loof0026.oopdraw.shape.Oval;

import java.awt.*;

/**
 * This class describes an oval composer
 * @author Raymon de Looff
 */
public class OvalComposer implements ShapeComposer {

    private Oval shape;

    @Override
    public AbstractShape create(Point point) {
        shape = new Oval();
        shape.setStartPoint(point);

        return shape;
    }

    @Override
    public void expand(Point point) {
        shape.setEndPoint(point);
    }

    @Override
    public void complete(Point point) {
        expand(point);
    }

}
