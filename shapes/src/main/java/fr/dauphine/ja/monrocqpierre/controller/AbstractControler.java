package fr.dauphine.ja.monrocqpierre.controller;

import fr.dauphine.ja.monrocqpierre.observer.AbstractDessin;

public abstract class AbstractControler {

	protected AbstractDessin abstractModel;
	
	public AbstractControler(AbstractDessin abstractModel) {
		this.abstractModel = abstractModel;
	}
	
	//TODO methode de remise à zero ?
	
	abstract void control();
}
