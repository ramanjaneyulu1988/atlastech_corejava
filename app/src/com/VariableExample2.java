package com;

/*
This examples to explain about
static and non-static methods and variables
*/
public class VariableExample2 {

	
	public String name = "Alex";
	public String address = "Blr";
	public static String department = "IT";
	
	public static void main(String[] args) {
		
		System.out.println("main method");
		
		VariableExample2 variableExample2 = new VariableExample2();
		
		VariableExample2.test();
		VariableExample2.test1(variableExample2);
		
		
		variableExample2.test2();
		
		System.out.println(variableExample2.name);
		System.out.println(variableExample2.address);
		System.out.println(VariableExample2.department);
	}
	
	public static void test()
	{
//		Here age variable is local
		int age = 30;
		System.out.println(age);
	}
	
	public static void test1(VariableExample2 variableExample2)
	{
//		VariableExample2 variableExample2 = new VariableExample2();
		
		System.out.println(variableExample2.name); // Alex
		System.out.println(variableExample2.address); // Blr
	}
	
	public void test2()
	{
		System.out.println(name); // Alex
		System.out.println(address); // Blr
	}
	
	
}
