package fr.dauphine.ja.monrocqpierre;

import java.awt.Dimension;

import javax.swing.JFrame;

import fr.dauphine.ja.monrocqpierre.controller.AbstractControler;
import fr.dauphine.ja.monrocqpierre.controller.MouseControler;
import fr.dauphine.ja.monrocqpierre.observer.AbstractDessin;
import fr.dauphine.ja.monrocqpierre.shapes.Anneau;
import fr.dauphine.ja.monrocqpierre.shapes.Cercle;
import fr.dauphine.ja.monrocqpierre.shapes.Dessin;
import fr.dauphine.ja.monrocqpierre.shapes.Point;
import fr.dauphine.ja.monrocqpierre.view.MyDisplay;


public class Main {

	public static void main(String[] args) {
		
		Dessin d = new Dessin();
		AbstractControler abstractController = new MouseControler(d);
		
		MyDisplay display = new MyDisplay(abstractController);
		d.addObserver(display);
		
		JFrame frame = new JFrame("Java Avancé");
		frame.setSize(new Dimension(600, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.addMouseMotionListener((new MouseControler(d)));
		frame.add(display);

		//Ceci est a mettre dans le controlleur ?
		Point p = new Point(190,400);
		Cercle c = new Cercle(new Point(50,50), 80);
		
		Anneau anneau = new Anneau(new Point(300,200), 75, 35);
		d.add(anneau);
		d.add(c);
		d.add(p);
	}
}
