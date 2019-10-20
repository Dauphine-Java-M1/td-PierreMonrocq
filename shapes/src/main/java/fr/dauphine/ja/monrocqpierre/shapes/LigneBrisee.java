package fr.dauphine.ja.monrocqpierre.shapes;

import java.util.LinkedList;
import java.util.List;

public class LigneBrisee {
	
	private List<Point> points;

	public LigneBrisee() {
		this.points = new LinkedList<Point>();
	}
	
	public int getNombrePoints() {
		return points.size();
	}
	
	public void add(Point point) {
		points.add(point);
	}
	
	public boolean contains(Point point) {
		return points.contains(point);
	}
}
