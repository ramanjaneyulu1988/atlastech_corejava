package com;

public class ConstructorExample1 {

	// Constructor
	public ConstructorExample1()
	{
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method");
		
		ConstructorExample1 constructorExample1 = new ConstructorExample1();
		
	}
	
	static
	{
		System.out.println("SIB");
	}
	
	{
		System.out.println("IIB");
	}
}