package fr.dauphine.ja.monrocqpierre.iterables.iterables;

import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

public class Mult {
	
	public static List<Integer>  mult(final int n, final List<Integer> list) {
		return new AbstractSequentialList<Integer>() {
			
			private int multi = n;
			private List<Integer> data = list;
			
			@Override
			public Integer get(int i) {
				return data.get(i)*multi;
			}

			@Override
			public int size() {
				return data.size();
			}

			@Override
			public ListIterator<Integer> listIterator(final int i) {
				return new ListIterator<Integer>() {
					private ListIterator<Integer> it = list.listIterator(); 
					
					public void add(Integer arg0) {
						// TODO Auto-generated method stub
						
					}

					public boolean hasNext() {	
						return it.hasNext();
					}

					public boolean hasPrevious() {
						return it.hasPrevious();
					}

					public Integer next() {
						return it.next()*n;
					}

					public int nextIndex() {
						// TODO Auto-generated method stub
						return 0;
					}

					public Integer previous() {
						return it.previous()*n;
					}

					public int previousIndex() {
						// TODO Auto-generated method stub
						return 0;
					}

					public void remove() {
						// TODO Auto-generated method stub
						
					}

					public void set(Integer arg0) {
						// TODO Auto-generated method stub
						
					}
					
				
			
			};
			
		}
		
	};
	}

}
