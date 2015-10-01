package nl.hz.ict.loof0026.oopdraw.shape;

import java.awt.*;
import java.util.ArrayList;

/**
 * This class describes a composer that can handle multiple shapes
 * @author Raymon de Looff
 */
public class ComposedShape extends AbstractShape {

    public ComposedShape() {
        shapes = new ArrayList<AbstractShape>();
    }

    @Override
    public void setStartPoint(Point point) {
        for(AbstractShape shape: shapes) {
            shape.setStartPoint(point);
        }
    }

    @Override
    public void setEndPoint(Point point) {
        for(AbstractShape shape: shapes) {
            shape.setEndPoint(point);
        }
    }

    /**
     * This method updates the shape start and end point
     */
    @Override
    public void updateShape() {
        for(AbstractShape shape: shapes) {
            shape.updateShape();
        }
    }

    @Override
    public void add(AbstractShape shape) {
        super.add(shape);
    }

    @Override
    public void remove(AbstractShape shape) {
        super.remove(shape);
    }

    @Override
    public void Draw(Graphics2D graphics) {
        super.Draw(graphics);

        for(AbstractShape shape: shapes) {
            shape.Draw(graphics);
        }
    }
}
