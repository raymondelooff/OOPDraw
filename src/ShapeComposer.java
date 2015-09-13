import java.awt.Point;

/**
 * This interface describes a shape composer
 * @author Raymon de Looff
 */
public interface ShapeComposer {
	
	public void create(Point point);
	
	public void expand(Point point);
	
	public void complete(Point point);

}
