package composer;

import shape.Rectangle;
import shape.Shape;

import java.awt.*;

/**
 * @author Raymon de Looff
 */
public class RectangleComposer implements ShapeComposer {

    private Rectangle rectangle;

    @Override
    public void create(Point point) {
        rectangle = new Rectangle(Color.ORANGE);
        rectangle.setStartPosition(point);
    }

    @Override
    public void expand(Point point) {
        rectangle.setEndPosition(point);
    }

    @Override
    public void complete(Point point) {
        rectangle.setEndPosition(point);
    }

    @Override
    public Shape getShape() {
        return rectangle;
    }

}
