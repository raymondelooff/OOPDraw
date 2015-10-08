package nl.hz.ict.loof0026.oopdraw;

import com.sun.deploy.util.StringUtils;
import nl.hz.ict.loof0026.oopdraw.composer.*;
import nl.hz.ict.loof0026.oopdraw.shape.AbstractShape;
import nl.hz.ict.loof0026.oopdraw.exception.*;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashSet;

import javax.swing.JFrame;

/**
 * A very simple vector drawing example. I have used the OO concept
 * of Polymorphism to declare on abstract AbstractShape class and then derived line,
 * rectangle and oval shape classes. The shapes are stored in a Vector so that
 * they remain on screen as new shapes are drawn. An offscreen image technique
 * is used to avoid flicker.
 */
public class OOPDraw2 extends JFrame implements MouseListener, MouseMotionListener {

	private static final long serialVersionUID = 4695753453561082104L;
	private ShapeComposer currentComposer;
	private HashSet<AbstractShape> shapes;

	/**
	 * Private constructor, because OOPDraw2 must be singleton
	 */
	public OOPDraw2() {
		// Initialize fields
		shapes = new HashSet<AbstractShape>();

		// Initialize the GUI
		initGUI();
	}

	@Override
	public void mousePressed(MouseEvent event) {
		// Where the mouse went down is the start position of the shape to be drawn
		int x = event.getX();
		int y = event.getY();
		Point startPosition = new Point(x, y);

		// Call create method
		AbstractShape shape = currentComposer.create(startPosition);

		// Add shape to shapes set
		shapes.add(shape);
	}

	@Override
	public void mouseReleased(MouseEvent event) {
		// Finally the mouse is up indicating shape drawing is over.
		// So set these mouseUp coordinates to set the end position.
		int x = event.getX();
		int y = event.getY();
		Point endPosition = new Point(x, y);

		// Call complete method
		currentComposer.complete(endPosition);

		repaint();
	}

	/**
	 * Mouse Drag i.e. Left mouse button is down and mouse is being moved
	 * 
	 * @see
	 * java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent
	 * )
	 */
	@Override
	public void mouseDragged(MouseEvent event) {
		// Now the mouse is being dragged without releasing,
		// which means that the user may stop his mouse over a
		// point but not release it. So that point is the
		// current endpoint
		int x = event.getX();
		int y = event.getY();
		Point position = new Point(x, y);

		// Call dragged method
		currentComposer.expand(position);

		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent event) {
		// Method not used
	}

	@Override
	public void mouseClicked(MouseEvent event) {
		// Method not used
	}

	@Override
	public void mouseEntered(MouseEvent event) {
		// Method not used
	}

	@Override
	public void mouseExited(MouseEvent event) {
		// Method not used
	}

	/**
	 * Paint method overridden for custom rendering of the screen
	 * 
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics g) {
		// To get a shadow effect
		g.setColor(Color.black);
		g.fillRect(0, 0, getSize().width, getSize().height);
		g.setColor(new Color(255, 255, 154));
		g.fillRect(1, 1, getSize().width - 3, getSize().height - 3);

		for(AbstractShape shape: shapes) {
			shape.Draw((Graphics2D) g);
		}
	}

	/**
	 * Capitalizes the letter of the given words
	 * @param string The words that need to be capitalized
	 * @return The capitalized words
	 */
	private String capitalize(String string) {
		String[] words = string.split(" ");
		String result = "";

		for(String word: words) {
			result += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
		}

		return StringUtils.trimWhitespace(result);
	}

	/**
	 * Initializes all GUI components
	 */
	private void initGUI() {
		// Get the composer factory
		ComposerFactory composerFactory = ComposerFactory.getInstance();

		// Set the frame
		setSize(800, 600);
		setTitle("Draw");
		setLayout(new FlowLayout());
		this.addMouseListener(this);
		this.addMouseMotionListener(this);

		// Initialize shape composers
		for(String shapeName: composerFactory.listComposerNames()) {
			Button button = new Button(capitalize(shapeName));
			button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						currentComposer = composerFactory.getComposer(shapeName);
					}
					catch (UnknownShapeException exception) {
						exception.printStackTrace();
					}
				}

			});
			add(button);

			// Set the default composer
			try {
				currentComposer = composerFactory.getComposer("line");
			}
			catch (UnknownShapeException e) {
				e.printStackTrace();
			}
		}

		// Clear view
		Button btnClear = new Button("Clear");
		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Clear the entire drawing screen
				// First remove all elements
				shapes.clear();

				// finally, call repaint()
				repaint();
			}

		});

		add(btnClear);
	}

	public static void main(String[] args) {
		OOPDraw2 frame = new OOPDraw2();
		frame.setVisible(true);
	}

}
