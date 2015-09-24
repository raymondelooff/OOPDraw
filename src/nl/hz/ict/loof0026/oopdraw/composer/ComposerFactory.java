package nl.hz.ict.loof0026.oopdraw.composer;

import nl.hz.ict.loof0026.oopdraw.exception.UnknownShapeException;

import java.util.HashMap;
import java.util.Set;

/**
 * This factory initializes the available shape composers
 * @author Raymon de Looff
 */
public class ComposerFactory {

    private HashMap<String, ShapeComposer> composers;

    public ComposerFactory() {
        // Intialize HashMap
        composers = new HashMap<String, ShapeComposer>();

        // Initialize composers
        LineComposer lineComposer = new LineComposer();
        OvalComposer ovalComposer = new OvalComposer();
        RectangleComposer rectangleComposer = new RectangleComposer();

        // Add composers to composers HashMap
        composers.put("line", lineComposer);
        composers.put("oval", ovalComposer);
        composers.put("rectangle", rectangleComposer);
    }

    /**
     * Return the a list of available shape names
     * @return A list of available shape names
     */
    public Set<String> listComposerNames() {
        return composers.keySet();
    }

    /**
     * This method returns the shape composer of the given shape
     * @param shapeName The shape name. Either 'line', 'oval' or 'rectangle'
     * @return The shape composer of the given shape name
     * @throws UnknownShapeException Throws the exception when a unknown shape name is given.
     */
    public ShapeComposer getComposer(String shapeName) throws UnknownShapeException {

        if(composers.containsKey(shapeName)) {
            return composers.get(shapeName);
        }

        throw new UnknownShapeException("Unknown shape type: " + shapeName);

    }

}
