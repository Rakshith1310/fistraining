package day3sorted;

import java.util.TreeSet;
import java.util.Set;


public class SortedDemo {
	public static void main(String[] args) 
	{
		Set<Integer> intset = new TreeSet<Integer>();
		
		intset.add(111);
		intset.add(345);
		intset.add(11);
		
		System.out.println(intset);
		System.out.println("=============");
		Set<String> strset = new TreeSet<String>();
		strset.add("Hello");
		strset.add("HELLO");
		strset.add("Abbb");
		
		System.out.println(strset);
	}

}
