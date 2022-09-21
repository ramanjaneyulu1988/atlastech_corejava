package oops.polymorphism;

class Person
{
	public void personName(String name)
	{
		System.out.println("Person method");
	}
}

class Employee extends Person
{
	public void personName(String name)
	{
		System.out.println("Employee method");
	}
}


public class MethodOveridingExample1 {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.personName("abc");
		
		Employee e = new Employee();
		e.personName("xyz");
		
	}
}
