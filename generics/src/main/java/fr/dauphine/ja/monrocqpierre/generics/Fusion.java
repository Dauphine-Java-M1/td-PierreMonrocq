package fr.dauphine.ja.monrocqpierre.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fusion {
	
	public static void main(String[] args) {
		List<String> l1= Arrays.asList("C", "rc");
		List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		List<? extends CharSequence> r1=fusion(l1,l2);
		List<?> r2=fusion(l1,l2);
		List<Integer> l3 = Arrays.asList(1,2);
		List<Integer> l4 = Arrays.asList(10,20);
		List<Integer> r3 = fusion(l3,l4);
		List<?> r4 = fusion(l1,l3);
	}
	
	private static <T> List<T> fusion(List<? extends T> l1, List<? extends T> l2) {
		
		List<T> fusion = new ArrayList<T>();
		
		int n = Math.max(l1.size(),l2.size());
		for(int i=0;i<n; i++) {
			if(i < l1.size()) {
				fusion.add(l1.get(i));
			}
			if(i < l2.size()) {
				fusion.add(l2.get(i));
			}
		}
		return fusion;
	}

}
