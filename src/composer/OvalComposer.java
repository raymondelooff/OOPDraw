package composer;

import shape.Oval;
import shape.Shape;

import java.awt.*;

/**
 * @author Raymon de Looff
 */
public class OvalComposer implements ShapeComposer {

    private Oval oval;

    @Override
    public void create(Point point) {
        oval = new Oval(Color.GREEN);
        oval.setStartPosition(point);
    }

    @Override
    public void expand(Point point) {
        oval.setEndPosition(point);
    }

    @Override
    public void complete(Point point) {
        oval.setEndPosition(point);
    }

    @Override
    public Shape getShape() {
        return oval;
    }

}
