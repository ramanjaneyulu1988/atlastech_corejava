package collectionfw.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromList1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

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
		
		List<String> uniqnessList = new ArrayList<String>();
		System.out.println(uniqnessList);
		
		for(String s : list)
		{
			if(!uniqnessList.contains(s))
			{
				uniqnessList.add(s);
			}
		}
		
		System.out.println(uniqnessList);
		
	}
}
