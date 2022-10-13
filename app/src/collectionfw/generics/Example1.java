package collectionfw.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		Employee emp = new Employee();
		emp.setAddress("Bangalore");
		emp.setId(100);
		emp.setFname("abc");
		emp.setLname("xyz");
		emp.setSalary(30000.0);

		Employee emp1 = new Employee();
		emp1.setAddress("USA");
		emp1.setId(101);
		emp1.setFname("Alex");
		emp1.setLname("Raj");
		emp1.setSalary(60000.0);
		
		Employee emp2 = new Employee();
		emp2.setAddress("India");
		emp2.setId(102);
		emp2.setFname("Maruthi");
		emp2.setLname("Daya");
		emp2.setSalary(40000.0);

		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		
		
		for(Employee e : list)
		{
			if(e.getAddress().contains("India"))
			{
				System.out.println(e);
			}
		}
		
//		System.out.println(list);
//		
//		System.out.println("Uisng normal for loop....");
//		for(int i=0; i<list.size(); i++)
//		{
//			System.out.println(list.get(i));
//			System.out.println("=========================");
//		}
//		
//		System.out.println("Using enhnaced for loop....");
//		for(Employee e : list)
//		{
//			System.out.println(e);
//			System.out.println("=========================");
//		}
//		
//		System.out.println("Using iterator...");
//		Iterator<Employee> it = list.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//			System.out.println("=========================");
//		}
	}
}
