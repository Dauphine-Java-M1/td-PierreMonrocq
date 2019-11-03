package fr.dauphine.ja.monrocqpierre.view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import fr.dauphine.ja.monrocqpierre.controller.AbstractControler;
import fr.dauphine.ja.monrocqpierre.observer.Observer;
import fr.dauphine.ja.monrocqpierre.shapes.Dessin;
import fr.dauphine.ja.monrocqpierre.shapes.Forme;


public class MyDisplay extends JPanel implements Observer{

	private static final long serialVersionUID = 1L;
	public static Color backGroundColor = Color.WHITE;
	private AbstractControler abstractControler;
	private Dessin d;//TODO comment passer une forme à paintComponent sans sauvegarde dans une variable locale à la vue ?
	
	public MyDisplay(AbstractControler controler) {
		this.abstractControler = controler;

		this.setOpaque(true);
		this.setBackground(backGroundColor);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Forme f : d.getFormes()) {
			f.getDrawer().draw(g);
		}
	}

	@Override
	public void update(Object source) {//On reçoit une maj du controler, ou de la methode main (debut)
		repaint();
		if(source.getClass() == Dessin.class) {
			this.d = (Dessin) source;
		}
		
	}
}
