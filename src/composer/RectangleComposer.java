package composer;

import shape.AbstractShape;
import shape.Rectangle;

import java.awt.*;

/**
 * This class describes a rectangle composer
 * @author Raymon de Looff
 */
public class RectangleComposer extends ShapeComposer {

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
