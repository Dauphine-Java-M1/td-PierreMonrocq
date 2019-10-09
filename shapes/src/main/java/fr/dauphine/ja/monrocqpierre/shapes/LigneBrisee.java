package fr.dauphine.ja.monrocqpierre.shapes;

import java.util.LinkedList;
import java.util.List;

public class LigneBrisee {
	
	private List<Point> data;
	private int nombrePoints = 0;

	public LigneBrisee(int nombreMaxPoints) {
		this.nombrePoints = nombreMaxPoints;
		this.data = new LinkedList<Point>();
	}
	
	public int getNombrePoints() {
		return nombrePoints;
	}
	
	public List<Point> getData() {
		return data;
	}
	
	public void add() {
		
	}
}
