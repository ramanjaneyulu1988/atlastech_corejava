package collectionfw.map;

import java.util.Map;
import java.util.TreeMap;

public class Example4 {

	public static void main(String[] args) {

		Map<String, String> map = new TreeMap<String, String>();

		map.put("c", null);
		map.put("Ram", "Dayyala");
		map.put("Rajesh", "Dayyala");
		map.put("Alex", "Kona");
		map.put("b", null);
		map.put("Rak", "Chitra");
		map.put("Maruthi", "Dayyala");
		map.put("Alex", "Kur");
		map.put("a", null);
		
		System.out.println(map);
	}
}
