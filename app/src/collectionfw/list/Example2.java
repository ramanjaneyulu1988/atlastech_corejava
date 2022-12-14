package collectionfw.list;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		// inserting data into list
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
		int size = list.size();
		System.out.println(size);
		
		boolean b = list.contains("Raj");
		System.out.println(b);
		
//		list.clear();
//		System.out.println(list);
		
		// Retreiving the data
		System.out.println(list.get(6));
		
		// deleting the data
		list.remove(0);
		System.out.println(list);
		
		// inserting with particular index
		list.add(0, "Maruthi");
		System.out.println(list);
		
		int index = list.indexOf("Rajesh");
		System.out.println(index);
		
		boolean isEmpty = list.isEmpty();
		System.out.println(isEmpty);
		
		System.out.println("Before updating...");
		System.out.println(list);
		
		// Updating
		list.set(0, "Praveen");
		System.out.println("After updating...");
		System.out.println(list);
		
		List subList1 = list.subList(0, 4);
		System.out.println(subList1);
		
		List subList2 = list.subList(4, 7);
		System.out.println(subList2);
		
		List subList3 = list.subList(7, list.size());
		System.out.println(subList3);
		
	}
}
