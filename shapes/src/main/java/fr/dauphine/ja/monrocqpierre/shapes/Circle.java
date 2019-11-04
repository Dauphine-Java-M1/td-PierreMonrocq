package fr.dauphine.ja.monrocqpierre.shapes;

import fr.dauphine.ja.monrocqpierre.view.CircleDrawer;
import fr.dauphine.ja.monrocqpierre.view.Drawer;

public class Circle implements Shape  {
	
	private Point c;
	private double r;
	private CircleDrawer cd;//TODO this might cause problem in the future
	
	
	public Circle(Point centre, double rayon) {
		this.c = centre;
		this.r = rayon;
		cd = new CircleDrawer(this);
	}
	
	public Circle(Point centre, double rayon, Model d) {
		this.c = centre;
		this.r = rayon;
		d.add(this);
		cd = new CircleDrawer(this);
	}
	
	public double surface() {
		return Math.PI * Math.pow(r,2);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Point)) return false;
		Circle cercle = (Circle) obj;
		return cercle.getCenter().equals(c) && cercle.getRadius() == r;
		
	}
	
	public boolean contains(Point point) {
		return c.produitScalaire(point) <= Math.pow(r, 2);
	}
	
	public static boolean contains(Point point, Circle...cercles) {
		for(Circle c : cercles) {
			if(c.contains(point)) return true;
		}
		return false;
	}
	
	public Point getCenter() {
		return c;
	}
	
	public double getRadius() {
		return r;
	}
	
	public void translate(int dx, int dy) {
		this.c.translate(dx, dy);
	}
	
	@Override
	public String toString() {
		return "centre: " + this.c + " rayon: " + this.r;
	}

	@Override
	public Drawer getDrawer() {
		return cd;
	}
}
