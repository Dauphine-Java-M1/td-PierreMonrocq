package fr.dauphine.ja.monrocqpierre.shapes;

import fr.dauphine.ja.monrocqpierre.observer.AbstractModel;
//Model
public class Model extends AbstractModel{
	
	public Model() {
	}
	
	public void add(Shape f) {
		formes.add(f);
		update();
	}
	
}
