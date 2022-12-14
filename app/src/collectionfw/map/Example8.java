package collectionfw.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Example8 {

	public static void main(String[] args) {

		Map<String, List<String>> map = new TreeMap<String, List<String>>();

		List<String> usaStates = new ArrayList<String>();

		usaStates.add("Washington");
		usaStates.add("Verginia");
		usaStates.add("California");
		
		map.put("USA", usaStates);
		
		List<String> indiaStates = new ArrayList<String>();

		indiaStates.add("Andhrapradesh");
		indiaStates.add("Telangana");
		indiaStates.add("Karntaka");
		indiaStates.add("Tamilnaadu");
		indiaStates.add("Kerala");

		map.put("India", indiaStates);
		
		System.out.println(map);
		
		Set<Entry<String, List<String>>> set = map.entrySet();
		System.out.println("By using entrySet with enhanced for loop...");
		for(Entry<String, List<String>> entry : set)
		{
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
	}
}
