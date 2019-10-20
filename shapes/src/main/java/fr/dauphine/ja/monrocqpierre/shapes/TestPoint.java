package fr.dauphine.ja.monrocqpierre.shapes;

public class TestPoint {

	public static void main(String[] args) {
		
		Point p = new Point();
		System.out.println(p);
		
		Point p1 = new Point(1, 2);
		System.out.println(p1);
		Point p2 = p1;
		Point p3 = new Point(1, 2);
		System.out.println(p3);
		
		System.out.println(p.equals(p2));
	}
}
