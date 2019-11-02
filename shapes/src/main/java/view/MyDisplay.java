package view;

import java.awt.Graphics;

import javax.swing.JPanel;

import shapes.Dessin;
import shapes.Forme;

public class MyDisplay extends JPanel{

	private static final long serialVersionUID = 1L;
	private Dessin dessin;

	public MyDisplay(Dessin d) {
		this.dessin = d;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		for(Forme f : dessin.getFormes()) {
			f.getDrawer().draw(g);
		}
	}
}
