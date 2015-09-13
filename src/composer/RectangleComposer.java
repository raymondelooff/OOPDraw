package composer;

import shape.Rectangle;
import shape.Shape;

import java.awt.*;

/**
 * @author Raymon de Looff
 */
public class RectangleComposer extends ShapeComposer {

    @Override
    public void create(Point point) {
        super.create(point);

        shape = new Rectangle(Color.ORANGE);
        shape.setStartPosition(point);
    }

}
