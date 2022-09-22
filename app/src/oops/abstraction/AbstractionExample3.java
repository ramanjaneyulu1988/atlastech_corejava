package oops.abstraction;


interface A
{
	void test();
}

interface B
{
	public void test();
}

public class AbstractionExample3 implements A,B
{
	public void test()
	{
		System.out.println("AbstractionExample3 - test");
	}
	
	public static void main(String args[])
	{
		A obj = new AbstractionExample3();
		
		obj.test();
	}
}
