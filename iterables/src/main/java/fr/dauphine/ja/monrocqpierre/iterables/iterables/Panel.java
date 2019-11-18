package fr.dauphine.ja.monrocqpierre.iterables.iterables;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class Panel extends AbstractList<Integer>{
	
	private final int fin;
	private final int debut;
	
	
	public Panel(int debut, int fin) {
		this.fin = fin;
		this.debut = debut;
	}
	
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>(){
			
			private int position = debut;

			public boolean hasNext() {
				return position <= fin;
			}

			public Integer next() {
				return position++;
			}
			
		};
	}
	
	public static List<Integer> panel3(int a, int b){
		return new Panel(a,b);
	}
	
	public static Iterator<Integer> panel1(int a, int b) {
		Panel p1 = new Panel(a,b);
		return p1.iterator();
	}
	
	public static Iterable<Integer> panel2(int a, int b) {
		return new Panel(a,b);
	}

	@Override
	public Integer get(int i) {
		if(debut+i>fin) throw new IndexOutOfBoundsException();
		return debut+i;
	}

	@Override
	public int size() {
		return fin-debut+1;
	}
	
	

}
