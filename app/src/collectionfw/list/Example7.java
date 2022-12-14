package collectionfw.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Example7 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Raj");
		list.add("Rak");
		list.add("Alex");
		list.add("Raj");
		list.add("Pavan");
		list.add("Rajesh");
		list.add("Alex");
		list.add("Alex");
		list.add("Alex");
		
		System.out.println(list);
		
		// Converting from List to TreeSet
		Set<String> set = new TreeSet<String>(list);
		System.out.println(set);
		
		Collections.sort(list);
		System.out.println(list);
		
		List<String> list2 = new ArrayList<String>();
		List<String> list1 = Collections.EMPTY_LIST;
		System.out.println(list1);
		
		
		Collections.synchronizedList(list);
		List<String> list3 = Collections.unmodifiableList(list);
		
		list3.remove(3);
		System.out.println(list3);
		
		
	}
}
