package fr.dauphine.ja.monrocqpierre.generics;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        System.out.println(Maximum.myMax(5,4,418,50));
        System.out.println(Maximum.myMax("baa", "aba"));
        List l= Arrays.asList("colonel", "reyel");
        System.out.println(Printer.listLength(l));
    }
}
