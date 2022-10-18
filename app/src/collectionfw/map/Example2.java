package collectionfw.map;

import java.util.HashMap;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Ram", "Dayyala");
		map.put("Rajesh", "Dayyala");
		map.put("Alex", "Kona");
		map.put("Rak", "Chitra");
		map.put("Maruthi", "Dayyala");
		map.put("Alex", "Kur");
		map.put(null, null);
		map.put(null, "abc");
		map.put("a", null);
		map.put("b", null);
		map.put("c", null);
		
		System.out.println(map);
	}
}
