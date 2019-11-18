package fr.dauphine.ja.monrocqpierre;

import java.awt.Dimension;

import javax.swing.JFrame;

import fr.dauphine.ja.monrocqpierre.controller.AbstractControler;
import fr.dauphine.ja.monrocqpierre.controller.MouseControler;
import fr.dauphine.ja.monrocqpierre.shapes.Ring;
import fr.dauphine.ja.monrocqpierre.shapes.Circle;
import fr.dauphine.ja.monrocqpierre.shapes.Model;
import fr.dauphine.ja.monrocqpierre.shapes.Point;
import fr.dauphine.ja.monrocqpierre.view.MyDisplay;


public class Main {

	public static void main(String[] args) {
		
		Model d = new Model();
		AbstractControler abstractController = new MouseControler(d);
		
		MyDisplay display = new MyDisplay(abstractController,d);
		d.addObserver(display);
		
		JFrame frame = new JFrame("Java Avancé");
		frame.setSize(new Dimension(600, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.addMouseMotionListener((new MouseControler(d)));
		frame.add(display);

		Point p = new Point(190,400);
		Circle c = new Circle(new Point(50,50), 80);
		Circle c2 = new Circle(new Point(300,200), 80);
		
		//Ring anneau = new Ring(new Point(300,200), 75, 35);
		//d.add(anneau);
		d.add(c);
		d.add(p);
		d.add(c2);
	}
}
