package fr.dauphine.ja.monrocqpierre.td00;

import java.util.ArrayList;
import java.util.Random;

public class PrimeCollection 
{
	
	private ArrayList<Integer> numbers;
	
	public PrimeCollection(ArrayList<Integer> num)
	{
		this.numbers = num;
	}
	
	public void initRandom(int n, int m)
	{
		Random rn = new Random();
		for(int i=0; i<n;i++) 
		{	
			int r = rn.nextInt(m)+1;
			this.numbers.add(r);
		}
	}
	
	private boolean isPrime(int p)
	{
	    if (p%2==0)
	    {
	    	return false;
	    }
	    	
	    for(int i=3;i*i<=p;i+=2)
	    {
	    	if(p%i==0)
	    	{
	    		return false;
	        }
	            
	    }
	    return true;
	}
	
	public void printPrimes() {
		for(int num : numbers) {
			if(isPrime(num)) 
			{
				System.out.print(num+" ");
			}
		}
	}
}