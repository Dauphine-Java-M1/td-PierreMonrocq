package shapes;

import java.util.ArrayList;
import java.util.List;

public class Dessin {

	private List<Forme> formes;
	
	public Dessin() {
		this.formes = new ArrayList<Forme>();
	}
	
	public void add(Forme f) {
		this.formes.add(f);
	}
	
	public List<Forme> getFormes() {
		return formes;
	}
}
