package returntypesonmethod;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("main method");
		Example1.test();
		long k = Example1.add(30, 40);
		System.out.println(k);
		
		double si = Example1.calculateSI(50000, 12, 2);
		System.out.println(si);
	}
	
	public static void test()
	{
		System.out.println("test method");
	}
	
	public static int add(int i, int j)
	{
		System.out.println("add method");
		int k = i+j;
		
		return k;
	}
	
	public static double calculateSI(double p, int t, double rateOfinterest)
	{
		double si = (p*t*rateOfinterest)/100;
		
		return si;
	}
}
