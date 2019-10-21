package fr.dauphine.ja.monrocqpierre.shapes;

public class Point extends Forme {
	
	private int x;
	private int y;
	private static int nbPoints=0;
	
	public Point() {
		this(0,0);
		Point.nbPoints++;
	}
		
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		Point.nbPoints++;
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
	
	public Point translate(int dx, int dy) {
		return new Point(this.x+dx,this.y+dy);
	}
	
	public static int getNbPoints() {
		return Point.nbPoints;
	}
	
	public static void setNbPoints(int nbPoints) {
		Point.nbPoints = nbPoints;
	}
	
	public double produitScalaire(Point point) {
		return Math.pow(point.getX() - this.x, 2) + Math.pow(point.getY() - this.y, 2);
	}

}
