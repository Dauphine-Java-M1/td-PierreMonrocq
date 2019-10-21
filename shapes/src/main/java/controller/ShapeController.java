package controller;

import fr.dauphine.ja.monrocqpierre.shapes.Forme;

public abstract class ShapeController {
	
	private Forme forme;
	
	public ShapeController(Forme forme) {
		 this.forme = forme;
	}
	
	abstract void control();
	

}
