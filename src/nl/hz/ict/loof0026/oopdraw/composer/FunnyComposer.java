package nl.hz.ict.loof0026.oopdraw.composer;

import nl.hz.ict.loof0026.oopdraw.shape.*;
import nl.hz.ict.loof0026.oopdraw.shape.Rectangle;

import java.awt.*;

/**
 * This class describes a composer that composes a line, rectangle and oval shape
 * @author Raymon de Looff
 */
public class FunnyComposer implements ShapeComposer {

    private ComposedShape shape;

    @Override
    public AbstractShape create(Point point) {
        // Create composed shape
        shape = new ComposedShape();

        // Create shapes and add it to the composed shape
        shape.add(new Line());
        shape.add(new Oval());
        shape.add(new Rectangle());

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
