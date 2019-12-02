package fr.dauphine.ja.monrocqpierre.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Printer {
	
	
	private static <T> void print(List<T> list) {
		for(T o : list) {
			System.out.println(o);
		}
	}
	
	private static <T extends CharSequence> void printCharSequence(List<T> list) {
		for(T o : list) {
			System.out.println(o.length());
		}
	}
	
//	public static void main(String[] args) {
//		List<String> list = Arrays.asList("foo","toto");
//		print(list);
//		printCharSequence(list);
//	}
	
	public static List<?> listLength(List<? extends CharSequence> list) {
		ArrayList<Integer> length = new ArrayList<Integer>();
		for(int i=0; i<list.size();i++) {
			CharSequence seq = list.get(i);
			length.add(seq.length());
		}
		return length;
	}
}
