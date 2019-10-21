package fr.dauphine.ja.monrocqpierre.shapes;

import java.util.ArrayList;

public abstract class Forme implements Observable  {
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private int positionX, positionY;
	
	public Forme() {
	}
	
	public void Draw(){
		System.out.println("je dessine");
	}
	
	@Override
	public void addObserver(Observer obs) {
		this.observers.add(obs);
	}
	
	@Override
	public void removeObserver(Observer obs) {
		this.observers.remove(obs);
	}

}
