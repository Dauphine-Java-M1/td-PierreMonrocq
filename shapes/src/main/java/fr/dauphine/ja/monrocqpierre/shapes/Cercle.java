package fr.dauphine.ja.monrocqpierre.shapes;

public class Cercle extends Forme {
	
	private Point c;
	private double r;
	
	
	public Cercle(Point centre, double rayon) {
		this.c = centre;
		this.r = rayon;
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
}
