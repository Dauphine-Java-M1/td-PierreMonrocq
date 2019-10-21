package fr.dauphine.ja.monrocqpierre.shapes;

public interface Observable {
	
	public void addObserver(Observer obs);
	public void removeObserver(Observer obs);
}
