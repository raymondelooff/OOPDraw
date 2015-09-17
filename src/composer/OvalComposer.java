package composer;

import shape.AbstractShape;
import shape.Oval;

import java.awt.*;

/**
 * @author Raymon de Looff
 */
public class OvalComposer extends ShapeComposer {

    @Override
    public AbstractShape create(Point point) {
        shape = new Oval();
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
        return expand(point);
    }
}
