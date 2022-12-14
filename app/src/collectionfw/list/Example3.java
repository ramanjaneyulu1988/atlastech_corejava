package collectionfw.list;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {

		List list1 = new ArrayList();

		// inserting data into list
		list1.add("Raj");
		list1.add("Rak");
		list1.add("Alex");
		list1.add("Raj");
		list1.add("Pavan");
		list1.add("Rajesh");
		list1.add("Alex");
		list1.add("Alex");
		list1.add("Alex");
		
		System.out.println(list1);
		
		List list2 = new ArrayList();

		// inserting data into list
		list2.add("Bangalore");
		list2.add("Hyderabad");
		list2.add("Chennai");
		list2.add("Vizag");
		
		System.out.println(list2);
		
		list1.addAll(list2);
		System.out.println(list1);
		
		list1.removeAll(list2); // list2 values will remove from list1
//		System.out.println(list1);
		
		list1.retainAll(list2); // list2 values will keep as it is and will remove rest of the values
		System.out.println(list2);
		
	}
}
