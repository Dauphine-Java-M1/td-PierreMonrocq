package fr.dauphine.ja.monrocqpierre.shapes;

public class Point {
	
	private int x;
	private int y;
	private static int compte=0;
	
	public Point() {
		Point.compte++;
	}
		
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		Point.compte++;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
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
		return this.isSameAs((Point) obj);
	}

}
