package com;

public class ConstructorExample2 {

		public String name;
		
	    // No arg Constructor or Default Constructor
		public ConstructorExample2()
		{
			System.out.println("Constructor");
			
			System.out.println(name); // Alex
		}
		
		// Argumented Constructor
		public ConstructorExample2(String name)
		{
			System.out.println("Argumented Constructor");
		}
		
		public static void main(String[] args) {
			
			System.out.println("Main method");
			
			ConstructorExample2 constructorExample2 = new ConstructorExample2();
			
			ConstructorExample2 constructorExample21 = new ConstructorExample2("abc");
		}
		
		static
		{
			System.out.println("SIB");
		}
		
		{
			System.out.println("IIB");
			name = "Alex";
		}
}
