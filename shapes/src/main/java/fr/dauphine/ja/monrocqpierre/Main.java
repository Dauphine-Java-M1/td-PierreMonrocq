package fr.dauphine.ja.monrocqpierre;

import java.awt.Dimension;

import javax.swing.JFrame;

import shapes.Cercle;
import shapes.Dessin;
import shapes.Point;
import view.MyDisplay;

public class Main {

	public static void main(String[] args) {
		
		Point p = new Point(300,200);
		Cercle c = new Cercle(p, 80);
		
		Dessin dessin = new Dessin();
		dessin.add(c);
		
		MyDisplay display = new MyDisplay(dessin);
		
		JFrame frame = new JFrame("Java Avancé");
		frame.setSize(new Dimension(600, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(display);
	}
}
