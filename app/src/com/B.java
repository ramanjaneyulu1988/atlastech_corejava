package com;

public class B {

	public static void main(String[] args) {
		
		System.out.println("main method");
		
		B.test();
		
		B b = new B();
		b.test1();
		b.test2();
		b.test3();
		
		A.test();
	}
	
	public static void test()
	{
		System.out.println("test method");
	}
	
	public void test1()
	{
		System.out.println("test1 method");
	}
	
	public void test2()
	{
		System.out.println("test2 method");
	}
	
	public void test3()
	{
		System.out.println("test3 method");
	}
	
}
