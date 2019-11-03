package fr.dauphine.ja.monrocqpierre.shapes;

import java.util.LinkedList;
import java.util.List;

import fr.dauphine.ja.monrocqpierre.view.Drawer;


public class LigneBrisee implements Forme {
	
	private List<Point> points;

	public LigneBrisee() {
		this.points = new LinkedList<Point>();
	}
	
	public LigneBrisee(Dessin d) {
		this.points = new LinkedList<Point>();
		d.add(this);
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

	@Override
	public Drawer getDrawer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void translate(int dx, int dy) {
		// TODO Auto-generated method stub
	}
}
