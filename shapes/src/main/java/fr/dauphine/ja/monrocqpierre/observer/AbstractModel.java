package fr.dauphine.ja.monrocqpierre.observer;

import java.util.ArrayList;
import java.util.List;

import fr.dauphine.ja.monrocqpierre.shapes.Shape;

public abstract class AbstractModel {
	
	private static List<Observer> observers = new ArrayList<Observer>();
	protected List<Shape> formes = new ArrayList<Shape>();

	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void update() {
		observers.forEach((e) -> {
			e.update();
		});
	}
	
	public List<Shape> getFormes() {
		return formes;
	}

}
