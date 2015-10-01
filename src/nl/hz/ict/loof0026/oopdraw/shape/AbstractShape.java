package nl.hz.ict.loof0026.oopdraw.shape;

import java.awt.*;
import java.util.ArrayList;

/**
 * base class shape.AbstractShape
 *
 */
public abstract class AbstractShape {

	protected Point startPoint, endPoint;
	protected Color color;
	protected ArrayList<AbstractShape> shapes;

	/**
	 * This method sets the start point of the shape
	 * @param point The start point of the shape
	 */
	public void setStartPoint(Point point) {
		this.startPoint = point;
	}

	/**
	 * This method sets the end point of the shape
	 * @param point The end point of the shape
	 */
	public void setEndPoint(Point point) {
		this.endPoint = point;
	}

	/**
	 * This method updates the shape start and end point
	 */
	public abstract void updateShape();

	/**
	 * This method adds a shape to the shapes list
	 * @param shape The shape to add
	 */
	public void add(AbstractShape shape) {
		shapes.add(shape);
	}

	/**
	 * This method removes the given shape from the shape list
	 * @param shape The shape to remove
	 */
	public void remove(AbstractShape shape) {
		shapes.remove(shape);
	}

	/**
	 * This method needs to be overrided to draw the correct shape
	 * @param graphics The graphics object to draw the object on
	 */
	public void Draw(Graphics2D graphics) {
		updateShape();

		// Set the shape color
		graphics.setColor(color);
	}

}
