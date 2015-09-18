package composer;

import shape.AbstractShape;
import shape.Oval;

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
