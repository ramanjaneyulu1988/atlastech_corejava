package collectionfw.set;

import java.util.HashSet;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("abc");
		set.add("xyz");
		set.add("aaa");
		set.add("Alex");
		set.add("abc");
		set.add("abc");
		set.add("abc");
		set.add("abc");
		set.add("abc");
		
		System.out.println(set);
	}
}
