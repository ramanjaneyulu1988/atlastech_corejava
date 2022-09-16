package com;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator.add(100, 60);
		Calculator.sub(100, 60);
		Calculator.mul(40, 2);
		Calculator.div(20, 2);
	}
	
	public static void add(int i, int j)
	{
		int k = i+j;
		System.out.println(k);
	}
	
	public static void sub(int i, int j)
	{
		int k = i-j;
		System.out.println(k);
	}
	
	public static void mul(int i, int j)
	{
		int k = i*j;
		System.out.println(k);
	}
	
	public static void div(int i, int j)
	{
		int k = i/j;
		System.out.println(k);
	}
}
