package app1;

import java.util.Hashtable;

public class MapExample1 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		
		hashtable.put(null, "300");
		
		System.out.println(hashtable);
	}
}
