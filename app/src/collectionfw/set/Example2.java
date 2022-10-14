package collectionfw.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Example2 {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<String>();

		set.add("abc");
		set.add("xyz");
		set.add("aaa");
		set.add("alex");
		set.add("abc");
		set.add("abc");
		set.add("abc");
		set.add("abc");
		set.add("abc");
		set.add("alex");
		set.add("alex");

		System.out.println(set);
		
		// Converting from Set to List
		List<String> list = new ArrayList<String>(set);
		Collections.reverse(list);
		
		System.out.println(list);
		
	}
}
