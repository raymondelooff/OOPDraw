package composer;

import shape.Oval;
import shape.Shape;

import java.awt.*;

/**
 * @author Raymon de Looff
 */
public class OvalComposer extends ShapeComposer {

    @Override
    public void create(Point point) {
        super.create(point);

        shape = new Oval(Color.GREEN);
        shape.setStartPosition(point);
    }

}
