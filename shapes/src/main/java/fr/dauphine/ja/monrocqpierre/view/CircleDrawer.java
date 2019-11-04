package fr.dauphine.ja.monrocqpierre.view;

import java.awt.Graphics;

import fr.dauphine.ja.monrocqpierre.shapes.Circle;


public class CircleDrawer extends Drawer {

	private Circle shape;

	public CircleDrawer(Circle circle) {
		this.shape = circle;
	}

	@Override
	public void draw(Graphics g) {

		double r = shape.getRadius();
		int x = (int) shape.getCenter().getX();
		int y = (int) shape.getCenter().getY();
		g.setColor(this.color);
	    g.fillOval((int) (x-r) , (int) (y-r), (int) r*2, (int) r*2);
	}
}
