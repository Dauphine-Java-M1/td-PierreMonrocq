package fr.dauphine.ja.monrocqpierre.controller;

import fr.dauphine.ja.monrocqpierre.observer.AbstractModel;

public abstract class AbstractControler {

	protected AbstractModel abstractModel;
	
	public AbstractControler(AbstractModel abstractModel) {
		this.abstractModel = abstractModel;
	}
	
	abstract void control();
}
