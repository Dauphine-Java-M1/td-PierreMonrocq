package fr.dauphine.ja.monrocqpierre.view;

import java.awt.Graphics;

import fr.dauphine.ja.monrocqpierre.shapes.Ring;


public class RingDrawer extends Drawer {

	private Ring shape;

	public RingDrawer(Ring ring) {
		this.shape = ring;
	}
	
	@Override
	public void draw(Graphics g) {
		double r = shape.getRayonInterieur();
		int x = (int) shape.getCercleExterne().getCenter().getX();
		int y = (int) shape.getCercleExterne().getCenter().getY();
		double z = (int) shape.getCercleExterne().getRadius();
		
	    g.setColor(this.color);
		g.fillOval((int) (x-z) , (int) (y-z), (int) z*2, (int) z*2);
		//g.setColor(MyDisplay.backGroundColor);
	    //g.fillOval((int) (x-r) , (int) (y-r), (int) r*2, (int) r*2);
	}

}
