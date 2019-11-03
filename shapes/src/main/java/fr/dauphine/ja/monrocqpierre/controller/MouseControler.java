package fr.dauphine.ja.monrocqpierre.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import fr.dauphine.ja.monrocqpierre.observer.AbstractDessin;
import fr.dauphine.ja.monrocqpierre.shapes.Anneau;
import fr.dauphine.ja.monrocqpierre.shapes.Cercle;
import fr.dauphine.ja.monrocqpierre.shapes.Forme;
import fr.dauphine.ja.monrocqpierre.shapes.Point;

public class MouseControler extends AbstractControler implements MouseMotionListener {

	public MouseControler(AbstractDessin abstractModel) {
		super(abstractModel);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		this.abstractModel.getFormes();
		for(int i=abstractModel.getFormes().size()-1; i>=0;i--) {
			Forme f = abstractModel.getFormes().get(i);
			if(abstractModel.getFormes().get(i).contains(new Point(e.getX(),e.getY()))) {
				f.translate(e.getX(), e.getY());//TODO ajouter une soustraction si utilisation de translate(dx,dy)
				System.out.println("translation");
			}
		}
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	void control() {
		
	}

}
