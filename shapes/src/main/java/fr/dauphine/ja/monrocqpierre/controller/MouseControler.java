package fr.dauphine.ja.monrocqpierre.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import fr.dauphine.ja.monrocqpierre.observer.AbstractModel;
import fr.dauphine.ja.monrocqpierre.shapes.Ring;
import fr.dauphine.ja.monrocqpierre.shapes.Circle;
import fr.dauphine.ja.monrocqpierre.shapes.Shape;
import fr.dauphine.ja.monrocqpierre.shapes.Point;

public class MouseControler extends AbstractControler implements MouseMotionListener {

	public MouseControler(AbstractModel abstractModel) {
		super(abstractModel);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		this.abstractModel.getFormes();
		for(int i=abstractModel.getFormes().size()-1; i>=0;i--) {
			Shape f = abstractModel.getFormes().get(i);
			if(abstractModel.getFormes().get(i).contains(new Point(e.getX(),e.getY()))) {
				f.translate(e.getX(), e.getY());
				abstractModel.update();
				break;
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
