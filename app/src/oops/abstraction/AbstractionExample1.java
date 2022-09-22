package oops.abstraction;


public class AbstractionExample1 extends Calculator
{
	public void add(int i, int j)
	{
		int k = i+j;
		
		System.out.println(k);
	}
	
	public void sub(int i, int j)
	{
		int k = i-j;
		
		System.out.println(k);
	}
	
	public static void main(String[] args) {
		
		Calculator a = new AbstractionExample1();
		
		a.add(10, 20);
		a.sub(50, 10);
	}
	
}
