package com;

public class SIBExample1 {

	public static String department = "Network";
	public static String name;
	public static String address;
	public static int age;
	
	public static void main(String[] args) {
		
		System.out.println("Main method");
		
		SIBExample1.test();
		SIBExample1.test1();
	}
	
	public static void test()
	{
		System.out.println(department); // IT
	}
	
	public static void test1()
	{
		department = "Admin";
		System.out.println(department); // Admin
	}
	
	static
	{
		department = "IT";
		name = "Alex";
		address = "Hyd";
		age = 30;
	}

}
