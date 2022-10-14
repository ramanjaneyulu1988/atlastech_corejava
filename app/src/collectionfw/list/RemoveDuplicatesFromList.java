package collectionfw.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
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
		
		// Converting from List to Set
		Set<String> set = new LinkedHashSet<String>(list);
		System.out.println(set);
	}
}
