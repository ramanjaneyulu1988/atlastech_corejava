package collectionfw;

import java.util.LinkedList;
import java.util.Queue;

public class Example1 {

	public static void main(String[] args) {
		
		Queue list = new LinkedList();
		
//		int k[] = new int[500];
//		k[0] = 100;
		
		list.add("Raj");
		list.add("Alex");
		list.add(5);
		list.add(100);
		list.add(false);
		list.add("Ram");
		list.add('a');
		
		System.out.println(list.size());
		
		System.out.println(list);
	}
}
