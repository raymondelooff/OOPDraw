package nl.hz.ict.loof0026.oopdraw.exception;

/**
 * This exception can be thrown when the shape name is not defined
 * @author Raymon de Looff
 */
public class UnknownShapeException extends Exception {

    public UnknownShapeException(String message) {
        super(message);
    }

}
