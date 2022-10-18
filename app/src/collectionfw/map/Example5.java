package collectionfw.map;

import java.util.Hashtable;
import java.util.Map;

public class Example5 {

	public static void main(String[] args) {

		Map<String, String> map = new Hashtable<String, String>();

		map.put("c", "c");
		map.put("Ram", "Dayyala");
		map.put("Rajesh", "Dayyala");
		map.put("Alex", "Kona");
		map.put("b", "b");
		map.put("Rak", "Chitra");
		map.put("Maruthi", "Dayyala");
		map.put("Alex", "Kur");
		map.put("a", "c");
		map.put(null, "abc");
		
		System.out.println(map);
	}
}
