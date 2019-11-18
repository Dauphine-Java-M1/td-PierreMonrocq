package fr.dauphine.ja.monrocqpierre.iterables.iterables;

import java.util.AbstractList;
import java.util.List;

public class Mult {
	
	public static List<Integer>  mult(final int n, final List<Integer> list) {
		return new AbstractList<Integer>() {

			@Override
			public Integer get(int i) {
				return list.get(i)*n;
			}

			@Override
			public int size() {
				return list.size();
			}
			
		};
		
	}

}
