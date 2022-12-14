package collectionfw.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example4 {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<String>();

		set.add("abc");
		set.add("xyz");
		set.add("aaa");
		set.add("Alex");
		set.add("abc");
		set.add("abc");
		set.add("abc");
		set.add("abc");
		set.add("abc");
		set.add("Alex");
		set.add("Alex");
		set.add("Blr");

		System.out.println(set);
		
		System.out.println("Using enhanced for loop...");
		for(String s : set)
		{
			System.out.println(s);
		}
		
		System.out.println("Using iterator...");
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("Using forEach method");
		set.forEach(s -> System.out.println(s));
		
		
	}
}
