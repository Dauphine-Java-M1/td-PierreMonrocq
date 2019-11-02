package shapes;

import view.CercleDrawer;
import view.Drawer;

public class Cercle implements Forme {
	
	private Point c;
	private double r;
	private CercleDrawer cd;//TODO this might cause problem in the future
	
	
	public Cercle(Point centre, double rayon) {
		this.c = centre;
		this.r = rayon;
		cd = new CercleDrawer(this);
	}
	
	public Cercle(Point centre, double rayon, Dessin d) {
		this.c = centre;
		this.r = rayon;
		d.add(this);
		cd = new CercleDrawer(this);
	}
	
	public double surface() {
		return Math.PI * Math.pow(r,2);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Point)) return false;
		Cercle cercle = (Cercle) obj;
		return cercle.getCentre().equals(c) && cercle.getRayon() == r;
		
	}
	
	public boolean contains(Point point) {
		return c.produitScalaire(point) <= Math.pow(r, 2);
	}
	
	public static boolean contains(Point point, Cercle...cercles) {
		for(Cercle c : cercles) {
			if(c.contains(point)) return true;
		}
		return false;
	}
	
	public Point getCentre() {
		return c;
	}
	
	public double getRayon() {
		return r;
	}
	
	public Cercle translate(int dx, int dy) {
		return new Cercle(c.translate(dx, dy),r);
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
