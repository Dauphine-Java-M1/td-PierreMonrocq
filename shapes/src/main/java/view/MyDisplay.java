package view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ShapeController;
import fr.dauphine.ja.monrocqpierre.shapes.Observer;

public class MyDisplay extends JFrame implements Observer{

	private static final long serialVersionUID = 1L;
	private JPanel container = new JPanel();

	private ShapeController controler;

	public MyDisplay() {
		setSize(500,500);
		setTitle("Mes formes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	
	@Override
	public void update() {
	}
	
}
