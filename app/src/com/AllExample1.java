package com;

public class AllExample1 {

	public static void main(String[] args) {
		
		System.out.println("Main method");
		AllExample1 allExample1 = new AllExample1();
		AllExample1 allExample_1 = new AllExample1(12);
		AllExample1.sub(30, 20);
		allExample1.add(50, 60);
	}
	
	static
	{
		System.out.println("SIB");
	}
	
	public AllExample1()
	{
		System.out.println("No arg Constructor");
	}
	
	public AllExample1(int age)
	{
		System.out.println("Argumented Constructor");
	}
	
	{
		System.out.println("IIB");
	}
	
	public void add(int i, int j)
	{
		int k = i+j;
		System.out.println(k);
	}
	
	public static void sub(int i, int j)
	{
		int k = i-j;
		System.out.println(k);
	}
}
