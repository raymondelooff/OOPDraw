package composer;

import shape.AbstractShape;
import shape.Rectangle;

import java.awt.*;

/**
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
    public AbstractShape expand(Point point) {
        shape.setEndPoint(point);

        return shape;
    }

    @Override
    public AbstractShape complete(Point point) {
        expand(point);

        return shape;
    }

}
