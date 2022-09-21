package oops.encapsulation;

class Employee
{
	// Variables / Attributes
	private String fname; // Ram
	private String lname;
	private int age;
	private String address;
	private String department;
	
	// via setters and getters method
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		
		if(fname.length() < 4 || fname.length() > 20)
		{
			System.out.println("Fname should be in between 4 to 8 characters...");
		}
		else
		{
			this.fname = fname;
		}
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}

public class EncapsulationExmaple1 {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setFname("Ramanjaneyulu");
		System.out.println(e.getFname()); // Ramanji
		
		e.setAddress("Blr");
		System.out.println(e.getAddress());
	}
}
