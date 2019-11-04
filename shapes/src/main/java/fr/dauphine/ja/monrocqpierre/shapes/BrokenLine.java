package fr.dauphine.ja.monrocqpierre.shapes;

import java.util.LinkedList;
import java.util.List;

import fr.dauphine.ja.monrocqpierre.view.Drawer;


public class BrokenLine implements Shape {
	
	private List<Point> points;

	public BrokenLine() {
		this.points = new LinkedList<Point>();
	}
	
	public BrokenLine(Model d) {
		this.points = new LinkedList<Point>();
		d.add(this);
	}
	
	public int getPointNumber() {
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
