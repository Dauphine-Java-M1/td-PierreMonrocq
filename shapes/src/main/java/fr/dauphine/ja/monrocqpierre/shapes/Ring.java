package fr.dauphine.ja.monrocqpierre.shapes;

import fr.dauphine.ja.monrocqpierre.view.RingDrawer;
import fr.dauphine.ja.monrocqpierre.view.Drawer;

public class Ring implements Shape {
	
	
	private Circle cercleExterne;
	private double rayonInterieur;
	private RingDrawer anneauDrawer;
	private Point center;
	
	public Ring(Point centre, double rayonExterne, double rayonInterne) {
		this.center = centre;
		if(rayonInterne > rayonExterne) {
			this.cercleExterne = new Circle(centre,rayonInterne);
			this.rayonInterieur = rayonExterne;
		}
		this.cercleExterne = new Circle(centre, rayonExterne);
		this.rayonInterieur = rayonInterne;
		this.anneauDrawer = new RingDrawer(this);
	}
	
	public boolean contains(Point point) {
		//double ps = cercleExterne.getCenter().produitScalaire(point);
		//return cercleExterne.contains(point) && ps >= Math.pow(rayonInterieur, 2);//TODO
		//return center.produitScalaire(point) <= Math.pow((rayonInterieur, 2);
		return false;
	}
	
	public static boolean contains(Point point, Ring...anneaux) {
		for(Ring a : anneaux) {
			if(a.contains(point)) return true;
		}
		return false;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Ring)) return false;
		Ring anneau = (Ring) obj;
		return cercleExterne.equals(anneau.cercleExterne) && anneau.rayonInterieur == rayonInterieur ;
	}
	
	@Override
	public String toString() {
		return cercleExterne + " Rayon interne:" + rayonInterieur;
	}
	
	public Circle getCercleExterne() {
		return cercleExterne;
	}
	
	public double getRayonInterieur() {
		return rayonInterieur;
	}

	@Override
	public Drawer getDrawer() {
		return anneauDrawer;
	}

	@Override
	public void translate(int dx, int dy) {
		this.center.translate(dx, dy);
	}

}
