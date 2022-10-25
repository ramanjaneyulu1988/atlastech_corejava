package collectionfw.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example9 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

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
		
		
		Set<Entry<String, String>> set = map.entrySet();
		
		System.out.println("By using entrySet with enhanced for loop...");
		for(Entry<String, String> entry : set)
		{
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
		System.out.println("By using entrySet with iterator...");
		Iterator<Entry<String, String>> it = set.iterator();
		while(it.hasNext())
		{
			Entry<String, String> entry  = it.next();
			System.out.println(entry.getKey()+" = "+ entry.getValue());
		}
		
		System.out.println("By using entrySet forEach method...");
		set.forEach(entry -> System.out.println(entry.getKey()+" =" + entry.getValue()));
		
		
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		System.out.println("By using keySet with enhanced for loop...");
		for(String key : keySet)
		{
			System.out.println(key+" = "+map.get(key));
		}
		
		System.out.println("By using keySet with iterator..");
		Iterator<String> it1 = keySet.iterator();
		while(it1.hasNext())
		{
			String key = it1.next();
			System.out.println(key+" = "+map.get(key));
		}
		
		System.out.println("By using keySet with forEach method..");
		keySet.forEach(k -> System.out.println(k+" = "+map.get(k)));
	}
}
