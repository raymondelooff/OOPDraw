/* 
 * Filename: OOPDraw2.java 
 * Written By: Sunit Katkar 
 * E-Mail:sunitkatkar@hotmail.com 
 * Home-Page : http://www.vidyut.com/sunit 
 * Java Page : www.vidyut.com/sunit/JavaPage.html 
 ****************************************************************** 
 * Description: 
 * A very simple vector drawing example. I have used the OO concept 
 * of Polymorphism to declare on abstract Shape class and then derived  
 * line, rectangle and oval shape classes. The shapes are stored in a 
 * Vector so that they remain on screen as new shapes are drawn. 
 * An offscreen image technique is used to avoid flicker. 
 **************************************************************** 
 * Copyright (c) 1997 Sunit Katkar All Rights Reserved. 
 * 
 * Permission to use, copy, modify, and distribute this software 
 * for NON-COMMERCIAL or COMMERCIAL purposes and without fee 
 * is hereby granted. 
 * 
 * Whew ! That was too much legalese..even to have copied and pasted 
 * from some other place... PLEASE DO NOT BLAME ME in any way 
 * if your system crashes because of this code, or if anything else 
 * bad happens. In short "DO WHAT YOU WANT BUT DONT BLAME ME !" 
 *****************************************************************/
import composer.LineComposer;
import composer.OvalComposer;
import composer.RectangleComposer;
import composer.ShapeComposer;
import shape.Shape;
import shape.Line;
import shape.Oval;
import shape.Rectangle;

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
 * Filename: OOPDraw2.java<br/>
 * Written By: Sunit Katkar<br/>
 * E-Mail:sunitkatkar@hotmail.com<br/>
 * Home-Page : [url]http://www.vidyut.com/sunit[/url]<br/>
 * Java Page : [url]www.vidyut.com/sunit/JavaPage.html[/url]
 * <p/>
 *******************************************************************************<p/>
 * Description: A very simple vector drawing example. I have used the OO concept
 * of Polymorphism to declare on abstract Shape class and then derived line,
 * rectangle and oval shape classes. The shapes are stored in a Vector so that
 * they remain on screen as new shapes are drawn. An offscreen image technique
 * is used to avoid flicker.
 * <p/>
 *******************************************************************************<p/>
 * Copyright (c) 1997 Sunit Katkar All Rights Reserved.
 * <p/>
 * 
 * Permission to use, copy, modify, and distribute this software for
 * NON-COMMERCIAL or COMMERCIAL purposes and without fee is hereby granted.
 * <p/>
 * 
 * Whew ! That was too much legalese..even to have copied and pasted from some
 * other place... PLEASE DO NOT BLAME ME in any way if your system crashes
 * because of this code, or if anything else bad happens. In short
 * "DO WHAT YOU WANT BUT DONT BLAME ME !"
 * <p/>
 *******************************************************************************<p/>
 * This code was modified by BugSlayer to change it from an applet into a
 * desktop application. Also, refactored the code a little bit to comply to
 * naming conventioned, infomration hiding and several other basic OO
 * principles.
 * <p/>
 ******************************************************************************/
public class OOPDraw2 extends JFrame implements MouseListener, MouseMotionListener {

	private static final long serialVersionUID = 4695753453561082104L;
	private static OOPDraw2 _instance;
	private ShapeComposer currentComposer;
	private HashSet<Shape> shapes;

	/**
	 * Private constructor, because OOPDraw2 must be singleton
	 */
	private OOPDraw2() {
		// Initialize fields
		shapes = new HashSet<Shape>();
		currentComposer = new LineComposer();

		// Do nothing in constructor off applet
		initGUI();
	}
	
	/**
	 * This method returns the singleton instance
	 * @return
	 */
	public static OOPDraw2 getInstance() {
		if(_instance == null) {
			_instance = new OOPDraw2();
		}
		
		return _instance;
	}

	@Override
	public void mousePressed(MouseEvent event) {
		// Where the mouse went down is the start position of the shape to be drawn
		int x = event.getX();
		int y = event.getY();
		Point startPosition = new Point(x, y);

		// Call create method
		currentComposer.create(startPosition);

		// Add shape to shapes set
		shapes.add(currentComposer.getShape());
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


		/*if (boval) {
			// All this jugglery because we do not want to draw oval
			// outside the applet area. Also we should be able to draw
			// the oval even if our starting point is at bottom right
			// and end point is at top left of the applet. Note that
			// top-left to top right is the positive x axis and top left
			// to left bottom is the positive y axis.
			Point drawto = new Point(Math.max(x, startPosition.x), Math.max(y, startPosition.y));
			Point newstart = new Point(Math.min(x, startPosition.x), Math.min(y, startPosition.y));
			nwidth1 = Math.abs((drawto.x - newstart.x));
			nheight1 = Math.abs((drawto.y - newstart.y));
			o = (Oval) vt.get(i);
			o.setWidth(nwidth1);
			o.setHeight(nheight1);
			o.setStart(newstart);
			i++;
			// increment the index of Vector as
			// cOval object is now added at current index i
		}
		if (brect) {
			Point drawto = new Point(Math.max(x, startPosition.x), Math.max(y, startPosition.y));
			Point newstart = new Point(Math.min(x, startPosition.x), Math.min(y, startPosition.y));
			nwidth1 = Math.abs((drawto.x - newstart.x));
			nheight1 = Math.abs((drawto.y - newstart.y));
			r = (Rect) vt.get(i);
			r.setWidth(nwidth1);
			r.setHeight(nheight1);
			r.setStart(newstart);
			i++;
			// increment the index of Vector as
			// cRect object is now added at current index i
		}*/

		repaint();
	}

	/*
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


		/*if (boval) {
			// Here we see where the shape drawing started (mouse went down) and
			// now where the mouse is (mouse drag). And we draw from this new
			// point to the point from which the mouse went down. This avoids
			// the shape.Oval/Rectangle from going out of the screen, or some really
			// weird things from happening.
			// Try to take simple shape.Line drawing type of approach and draw from
			// bottom
			// right to top left and see what happens :)
			Point drawto = new Point(Math.max(x, startPosition.x), Math.max(y, startPosition.y));
			Point newstart = new Point(Math.min(x, startPosition.x), Math.min(y, startPosition.y));
			nwidth1 = Math.abs((drawto.x - newstart.x));
			nheight1 = Math.abs((drawto.y - newstart.y));
			o = (Oval) vt.get(i);
			o.setWidth(nwidth1);
			o.setHeight(nheight1);
			o.setStart(newstart);
		}
		if (brect) {
			Point drawto = new Point(Math.max(x, startPosition.x), Math.max(y, startPosition.y));
			Point newstart = new Point(Math.min(x, startPosition.x), Math.min(y, startPosition.y));
			nwidth1 = Math.abs((drawto.x - newstart.x));
			nheight1 = Math.abs((drawto.y - newstart.y));
			r = (Rect) vt.get(i);
			r.setWidth(nwidth1);
			r.setHeight(nheight1);
			r.setStart(newstart);
		}*/

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

	/*
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

		for(Shape shape: shapes) {
			shape.Draw((Graphics2D) g);
		}
	}

	/*
	 * Initialize all GUI components
	 */
	private void initGUI() {
		setSize(800, 600);
		setTitle("Draw");
		setLayout(new FlowLayout());
		this.addMouseListener(this);
		this.addMouseMotionListener(this);

		// shape.Line
		Button btnLine = new Button("Line");
		btnLine.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				currentComposer = new LineComposer();
			}

		});

		// shape.Oval
		Button btnOval = new Button("Oval");
		btnOval.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				currentComposer = new OvalComposer();
			}

		});

		// Rectangle
		Button btnRect = new Button("Rectangle");
		btnRect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				currentComposer = new RectangleComposer();
			}

		});

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

		add(btnLine);
		add(btnOval);
		add(btnRect);
		add(btnClear);
	}

	public static void main(String[] args) {
		OOPDraw2 frame = getInstance();
		frame.setVisible(true);
	}

}
