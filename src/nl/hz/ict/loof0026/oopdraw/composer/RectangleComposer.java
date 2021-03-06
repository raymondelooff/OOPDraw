package nl.hz.ict.loof0026.oopdraw.composer;

import nl.hz.ict.loof0026.oopdraw.shape.AbstractShape;
import nl.hz.ict.loof0026.oopdraw.shape.Rectangle;
import org.w3c.dom.css.Rect;

import java.awt.*;

/**
 * This class describes a rectangle composer
 * @author Raymon de Looff
 */
public class RectangleComposer implements ShapeComposer {

    private Rectangle shape;

    @Override
    public AbstractShape create(Point point) {
        shape = new Rectangle();
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
