package com;

public class VariableExample1 {

	// Global variables
	public static String fname = "Alex";
	public String lname = "Xyz";
	
	public static void main(String[] args) {
		
		// Local variable
		int i = 10;
		
		System.out.println("main method");
		System.out.println(VariableExample1.fname);
		
		VariableExample1 variableExample1 = new VariableExample1();
		System.out.println(variableExample1.lname);
	}
	
	public static void test()
	{
		System.out.println(VariableExample1.fname);
		
		VariableExample1 variableExample1 = new VariableExample1();
		System.out.println(variableExample1.lname);
	}
	
	public static void test1()
	{
		System.out.println(VariableExample1.fname);
		
		VariableExample1 variableExample1 = new VariableExample1();
		System.out.println(variableExample1.lname);
	}
	
	
}
