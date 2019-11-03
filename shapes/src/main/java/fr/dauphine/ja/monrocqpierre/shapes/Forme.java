package fr.dauphine.ja.monrocqpierre.shapes;

import fr.dauphine.ja.monrocqpierre.view.Drawer;

public interface Forme  {
	
	public Drawer getDrawer();
	
	public boolean contains(Point point);
	
	public void translate(int dx, int dy);
}
