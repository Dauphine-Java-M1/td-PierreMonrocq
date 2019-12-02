package fr.dauphine.ja.monrocqpierre.iterables.iterables;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class Mult {
	
	public static List<Integer>  mult(final int n, final List<Integer> list) {
		
		if(list instanceof RandomAccess) {
		
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
		} else {
			
			return new AbstractSequentialList<Integer>() {
				
				public int size() {
					return list.size();
				}
				
				@Override
				public ListIterator<Integer> listIterator(final int i) {
					
					return new ListIterator<Integer>() {
						
					
						private ListIterator<Integer> it = list.listIterator(); 
						
						public void add(Integer arg0) {
							throw new UnsupportedOperationException();
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
							return it.nextIndex();
						}
	
						public Integer previous() {
							return it.previous()*n;
						}
	
						public int previousIndex() {
							return it.previousIndex();
						}
	
						public void remove() {
							throw new UnsupportedOperationException();	
							
						}
	
						public void set(Integer arg0) {
							throw new UnsupportedOperationException();	
							
						}
				};
			
				}

			
		};
	}

	}
}
