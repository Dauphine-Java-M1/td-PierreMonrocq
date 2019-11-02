package shapes;

import view.Drawer;

public class Anneau implements Forme {
	
	
	private Cercle cercleExterne;
	private double rayonInterieur;
	
	public Anneau(Point centre, double rayonExterne, double rayonInterne) {
		if(rayonInterne > rayonExterne) {
			this.cercleExterne = new Cercle(centre,rayonInterne);
			this.rayonInterieur = rayonExterne;
		}
		this.cercleExterne = new Cercle(centre, rayonExterne);
		this.rayonInterieur = rayonInterne;
	}
	
	public boolean contains(Point point) {
		double ps = cercleExterne.getCentre().produitScalaire(point);
		return cercleExterne.contains(point) && ps >= Math.pow(rayonInterieur, 2);
	}
	
	public static boolean contains(Point point, Anneau...anneaux) {
		for(Anneau a : anneaux) {
			if(a.contains(point)) return true;
		}
		return false;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Anneau)) return false;
		Anneau anneau = (Anneau) obj;
		return cercleExterne.equals(anneau.cercleExterne) && anneau.rayonInterieur == rayonInterieur ;
	}
	
	@Override
	public String toString() {
		return cercleExterne + " Rayon interne:" + rayonInterieur;
	}
	
	public Cercle getCercleExterne() {
		return cercleExterne;
	}
	
	public double getRayonInterieur() {
		return rayonInterieur;
	}

	@Override
	public Drawer getDrawer() {
		// TODO Auto-generated method stub
		return null;
	}

}
