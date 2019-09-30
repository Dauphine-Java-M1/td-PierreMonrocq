package fr.dauphine.ja.monrocqpierre.td00;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> monarraylist = new ArrayList<Integer>();
		PrimeCollection pc = new PrimeCollection(monarraylist);
		
		pc.initRandom(100, 2000);
		pc.printPrimes();
	}

}
