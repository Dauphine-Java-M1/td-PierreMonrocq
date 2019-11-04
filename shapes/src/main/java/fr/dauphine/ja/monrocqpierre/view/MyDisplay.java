package fr.dauphine.ja.monrocqpierre.view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import fr.dauphine.ja.monrocqpierre.controller.AbstractControler;
import fr.dauphine.ja.monrocqpierre.observer.Observer;
import fr.dauphine.ja.monrocqpierre.shapes.Model;
import fr.dauphine.ja.monrocqpierre.shapes.Shape;


public class MyDisplay extends JPanel implements Observer{

	private static final long serialVersionUID = 1L;
	public static Color backGroundColor = Color.WHITE;
	private AbstractControler abstractControler;
	private Model d;
	
	public MyDisplay(AbstractControler controler, Model dessin) {
		this.abstractControler = controler;
		this.setOpaque(true);
		this.setBackground(backGroundColor);
		this.d = dessin;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Shape f : d.getFormes()) {
			f.getDrawer().draw(g);
		}
	}

	@Override
	public void update() {
		repaint();
	}
}
