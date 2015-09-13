package shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * base class shape.Shape
 *
 */
public abstract class Shape {

	protected Point startPosition, endPosition;
	protected int height, width;
	protected Color shapeColor; // Default color

	/**
	 * Constructor for the abstract shapes
	 */
	public Shape() {
		shapeColor = Color.RED;
	}

	/**
	 * Constructor for the abstract shapes
	 * @param color The color of the shape
	 */
	public Shape(Color color) {
		shapeColor = color;
	}

	/**
	 * This method sets the start point of the shape
	 * @param point The start point of the shape
	 */
	public void setStartPosition(Point point) {
		startPosition = point;
	}

	/**
	 * This method sets the end point of the shape
	 * @param point The end point of the shape
	 */
	public void setEndPosition(Point point) {
		endPosition = point;
	}

	/**
	 * This method sets the new height of the shape
	 * @param height The new height of the shape
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * This method sets the new width of the shape
	 * @param width The new width of the shape
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * This method sets the color of the shape
	 * @param color The new color of the shape
	 */
	protected void setShapeColor(Color color) {
		shapeColor = color;
	}

	/**
	 * This method returns the start point of the shape
	 * @return The start point of the shape
	 */
	public Point getStartPosition() {
		return startPosition;
	}

	/**
	 * This method returns the end point of the shape
	 * @return The end point of the shape
	 */
	public Point getEndPosition() {
		return endPosition;
	}

	/**
	 * This method returns the height of the shape object
	 * @return The height of the shape object
	 */
	protected int getHeight() {
		return height;
	}

	/**
	 * This method returns the width of the shape object
	 * @return The width of the shape object
	 */
	protected int getWidth() {
		return width;
	}

	/**
	 * This method returns the shape color
	 * @return The shape color
	 */
	protected Color getShapeColor() {
		return shapeColor;
	}

	/**
	 * This method needs to be overrided to draw the correct shape
	 * @param graphics The graphics object to draw the object on
	 */
	public void Draw(Graphics2D graphics) {
		graphics.setColor(shapeColor);
	}

}
