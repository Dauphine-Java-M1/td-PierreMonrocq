package view;

import java.awt.Color;
import java.awt.Graphics;

import shapes.Cercle;

public class CercleDrawer extends Drawer {

	private Cercle shape;
	private Color color;

	public CercleDrawer(Cercle cercle) {
		this.shape = cercle;
		this.color = randomColor();
	}

	@Override
	public void draw(Graphics g) {

		double r = shape.getRayon();
		int x = (int) shape.getCentre().getX();
		int y = (int) shape.getCentre().getY();
		g.setColor(color);
	    g.fillOval((int) (x - r) , (int) (y - r), (int) r*2, (int) r*2);
	    g.setColor(Color.BLACK);
	    g.drawOval((int) (x - r) , (int) (y - r), (int) r*2, (int) r*2);
	}
}
