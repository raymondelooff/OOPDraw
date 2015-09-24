package nl.hz.ict.loof0026.oopdraw.composer;

import nl.hz.ict.loof0026.oopdraw.exception.*;

/**
 * This factory initializes the available shape composers
 * @author Raymon de Looff
 */
public class ComposerFactory {

    private LineComposer lineComposer;
    private OvalComposer ovalComposer;
    private RectangleComposer rectangleComposer;

    public ComposerFactory() {
        lineComposer = new LineComposer();
        ovalComposer = new OvalComposer();
        rectangleComposer = new RectangleComposer();
    }

    /**
     * This method returns the shape composer of the given shape
     * @param shapeType The shape type. Either 'line', 'oval' or 'rectangle'
     * @return The shape composer of the given shape type
     * @throws UnknownShapeException Throws the exception when a unknown shape type is given.
     */
    public ShapeComposer getComposer(String shapeType) throws UnknownShapeException {
        switch(shapeType.toLowerCase()) {

            case "line":
                return lineComposer;

            case "oval":
                return ovalComposer;

            case "rectangle":
                return rectangleComposer;

            default:
                throw new UnknownShapeException("Unknown shape type: " + shapeType);

        }
    }

}
