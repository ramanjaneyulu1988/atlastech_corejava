package com;

public class SIBExample2 {

	public String name;
	
	// main method
	public static void main(String[] args) {
		
		System.out.println("Main method");
		
		SIBExample2 sibExample2 = new SIBExample2();
		
	}
	
	// SIB
	static
	{
		System.out.println("SIB1");
	}
	
	static
	{
		System.out.println("SIB2");
	}
}



