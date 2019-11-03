package fr.dauphine.ja.monrocqpierre.shapes;

import fr.dauphine.ja.monrocqpierre.view.Drawer;
import fr.dauphine.ja.monrocqpierre.view.PointDrawer;

public class Point implements Forme {
	
	private int x;
	private int y;
	private static int nbPoints=0;
	private final int thickness = 5;
	private PointDrawer pd;
	
	public Point() {
		this(0,0);
		Point.nbPoints++;
		this.pd = new PointDrawer(this,thickness);
	}
		
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		Point.nbPoints++;
		this.pd = new PointDrawer(this,thickness);
	}
	
	public Point(int x, int y, Dessin d) {
		this.x = x;
		this.y = y;
		Point.nbPoints++;
		d.add(this);
		this.pd = new PointDrawer(this,thickness);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
	
	public boolean isSameAs(Point p) {
		return (this.x==p.x && this.y == p.y);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Point)) return false;
		Point p = (Point) obj;
		return this.isSameAs(p);
	}
	
//	public Point translate(int dx, int dy) {//TODO
//		return new Point(this.x+dx,this.y+dy);
//	}
	
	public static int getNbPoints() {
		return Point.nbPoints;
	}
	
	public static void setNbPoints(int nbPoints) {
		Point.nbPoints = nbPoints;
	}
	
	public double produitScalaire(Point point) {
		return Math.pow(point.getX() - this.x, 2) + Math.pow(point.getY() - this.y, 2);
	}

	@Override
	public Drawer getDrawer() {
		return pd;
	}

	@Override
	public boolean contains(Point point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void translate(int dx, int dy) {//Remplacement du retour Point (immutable) 
		setX(dx);
		setY(dy);
		
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

}
