package collectionfw.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example6 {

	public static void main(String[] args) {
		
		List list = new ArrayList();

//		[20,40,1, 5, 60] --> [1,5,20,40,60] --> [60, 40, 20, 5, 1]
		// inserting data into list
		list.add(null);
		list.add("Raj");
		list.add("Rak");
		list.add("Alex");
		list.add("Raj");
		list.add("Pavan");
		list.add("Rajesh");
		list.add("Alex");
		list.add("Alex");
		list.add("Alex");
//		list.add(123);
//		list.add(123.60);
//		list.add('a');
//		list.add(false);
	
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
	}
}
