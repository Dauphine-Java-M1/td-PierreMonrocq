package fr.dauphine.ja.monrocqpierre.observer;

import java.util.ArrayList;
import java.util.List;

import fr.dauphine.ja.monrocqpierre.shapes.Forme;

public abstract class AbstractDessin {
	
	private static List<Observer> observers = new ArrayList<Observer>();
	protected List<Forme> formes = new ArrayList<Forme>();

	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void update(Object source) {
		observers.forEach((e) -> {
			e.update(this);
		});
	}
	
	public List<Forme> getFormes() {
		return formes;
	}

}
