package fr.dauphine.ja.monrocqpierre.view;

import java.awt.Graphics;

import fr.dauphine.ja.monrocqpierre.shapes.Cercle;


public class CercleDrawer extends Drawer {

	private Cercle shape;

	public CercleDrawer(Cercle cercle) {
		this.shape = cercle;
	}

	@Override
	public void draw(Graphics g) {

		double r = shape.getRayon();
		int x = (int) shape.getCentre().getX();
		int y = (int) shape.getCentre().getY();
		g.setColor(this.color);
	    g.fillOval((int) (x-r) , (int) (y-r), (int) r*2, (int) r*2);
	}
}
