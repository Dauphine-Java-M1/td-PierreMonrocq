package fr.dauphine.ja.monrocqpierre.threads;

import java.util.ArrayList;

public class MySafeList{

	
	private static final long serialVersionUID = 1L;
	private ArrayList<Double> list;
	
	public MySafeList() {
		list = new ArrayList<Double>();
	}
	
	public void add(Double e) {
		list.add(e);
	}
	
	public int size() {
		return list.size();
	}
	
	public Double get(int index) {
		return list.get(index);
	}
	
	
	private static void stressTest(int n, int m) {
		
	}
	

}
