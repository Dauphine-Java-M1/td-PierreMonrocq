package fr.dauphine.ja.monrocqpierre.generics;

public class Maximum {
	
	public static <T extends Comparable<T>> T myMax(T o, T ... objets) {
		T max = o;
		for(T i : objets) {
			if(i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}
	

}
