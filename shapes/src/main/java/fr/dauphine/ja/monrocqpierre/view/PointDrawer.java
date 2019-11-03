package fr.dauphine.ja.monrocqpierre.view;

import java.awt.Graphics;

import fr.dauphine.ja.monrocqpierre.shapes.Point;

public class PointDrawer extends Drawer {

	private Point point;
	private int thickness;
	
	public PointDrawer(Point p, int thickness) {
		this.point = p;
		this.thickness = thickness;
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.fillOval(point.getX(), point.getY(), thickness, thickness);
	}
	
	

}
