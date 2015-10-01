package nl.hz.ict.loof0026.oopdraw.composer;

import nl.hz.ict.loof0026.oopdraw.exception.UnknownShapeException;

import java.util.HashMap;
import java.util.Set;

/**
 * This factory initializes the available shape composers
 * @author Raymon de Looff
 */
public class ComposerFactory {

    private static ComposerFactory _instance;
    private HashMap<String, ShapeComposer> composers;

    private ComposerFactory() {
        // Intialize HashMap
        composers = new HashMap<String, ShapeComposer>();

        // Initialize composers
        LineComposer lineComposer = new LineComposer();
        OvalComposer ovalComposer = new OvalComposer();
        RectangleComposer rectangleComposer = new RectangleComposer();
        RoundedRectangleComposer roundedRectangleComposer = new RoundedRectangleComposer();
        FunnyComposer funnyComposer = new FunnyComposer();

        // Add composers to composers HashMap
        composers.put("line", lineComposer);
        composers.put("oval", ovalComposer);
        composers.put("rectangle", rectangleComposer);
        composers.put("rounded rectangle", roundedRectangleComposer);
        composers.put("funny", funnyComposer);
    }

    /**
     * Return the singleton instance of the ComposerFactory
     * @return The singleton instance of the ComposerFactory
     */
    public static ComposerFactory getInstance() {
        if(_instance == null) {
            _instance = new ComposerFactory();
        }

        return _instance;
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
