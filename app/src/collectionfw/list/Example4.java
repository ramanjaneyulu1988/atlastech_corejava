package collectionfw.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Example4 {

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
		
		System.out.println("\nUsing normal loop....\n");
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i).toString().startsWith("A"))
			{
				System.out.println(list.get(i));
			}
		}
		
		System.out.println("\nUsing Enhanced for loop...\n");
		for(Object obj : list)
		{
			System.out.println(obj);
		}
		
		System.out.println("\nUsing iterator...\n");
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("\nUsing listIterator...\n");
		ListIterator lit = list.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
	}
}
