package collectionfw.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		
		Map<String, String> map = new LinkedHashMap<String, String>();
		
		Scanner sc = new Scanner(System.in);
		
		int i = 3;
		while(i <= 3)
		{
			System.out.println("Enter key value:");
			String key = sc.nextLine();
			
			System.out.println("Enter value value:");
			String value = sc.nextLine();
			
			if(key != null && value != null)
			{
				map.put(key, value);
			}
		}
	}
}
