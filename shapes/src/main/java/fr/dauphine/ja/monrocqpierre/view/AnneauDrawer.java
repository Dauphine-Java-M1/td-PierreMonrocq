package fr.dauphine.ja.monrocqpierre.view;

import java.awt.Graphics;

import fr.dauphine.ja.monrocqpierre.shapes.Anneau;


public class AnneauDrawer extends Drawer {

	private Anneau shape;

	public AnneauDrawer(Anneau anneau) {
		this.shape = anneau;
	}
	
	@Override
	public void draw(Graphics g) {
		double r = shape.getRayonInterieur();
		int x = (int) shape.getCercleExterne().getCentre().getX();
		int y = (int) shape.getCercleExterne().getCentre().getY();
		double z = (int) shape.getCercleExterne().getRayon();
		
	    g.setColor(this.color);
		g.fillOval((int) (x-z) , (int) (y-z), (int) z*2, (int) z*2);
		g.setColor(MyDisplay.backGroundColor);
	    g.fillOval((int) (x-r) , (int) (y-r), (int) r*2, (int) r*2);
	}

}
