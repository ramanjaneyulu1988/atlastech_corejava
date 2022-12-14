package collectionfw.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Map<String, List<Employee>> map = new HashMap<String, List<Employee>>();
		
		Employee emp1 = new Employee(100, "a", "Dayyala", 50000.0, "HR");
		Employee emp2 = new Employee(101, "b", "Kona", 80000.0, "HR");
		Employee emp3 = new Employee(102, "c", "Chitra", 90000.0, "HR");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		map.put("HR", empList);
		
		Employee emp4 = new Employee(103, "Raj", "Dayyala", 40000.0, "IT");
		Employee emp5 = new Employee(104, "Rak", "Kona", 80000.0, "IT");
		Employee emp6 = new Employee(105, "Ram", "Chitra", 70000.0, "IT");
		
		List<Employee> empList1 = new ArrayList<Employee>();
		empList1.add(emp4);
		empList1.add(emp5);
		empList1.add(emp6);
		
		map.put("IT", empList1);
		
		System.out.println(map.get("IT"));
		
		System.out.println(map.size());
		
		System.out.println(map.containsKey("Admin"));
	}
}
