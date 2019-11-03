package fr.dauphine.ja.monrocqpierre.shapes;

import fr.dauphine.ja.monrocqpierre.observer.AbstractDessin;
//Model
public class Dessin extends AbstractDessin{
	
	public Dessin() {
	}
	
	public void add(Forme f) {
		formes.add(f);
		update(f);
	}
	
}
