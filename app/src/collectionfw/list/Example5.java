package collectionfw.list;

import java.util.LinkedList;
import java.util.Queue;

public class Example5 {

	public static void main(String[] args) {
		
		Queue queue = new LinkedList();
		
		queue.add("abc");
		queue.add("axubc");
		queue.add("abc");
		queue.add("xyz");
		
		System.out.println(queue);
		
	}
}
