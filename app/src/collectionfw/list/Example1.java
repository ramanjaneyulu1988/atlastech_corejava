package collectionfw.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List list = new ArrayList();
		
		System.out.println("Enter first name");
		String fname = sc.nextLine();
		list.add(fname);
		
		System.out.println("Enter last name");
		String lname = sc.nextLine();
		list.add(lname);
		
		System.out.println("Enter address");
		String address = sc.nextLine();
		list.add(address);
		
		System.out.println(list);
		
		
		
	}
}
