package oops.abstraction;

public interface Calc 
{
	// abstract methods
	public abstract void add(int i, int j);

	void sub(int i, int j);
	
	// interfaces will allow static and default methods from java 8 onwards....
	
	public static void test()
	{
		
	}
	
	// This default keyword is introduced in java 8
	default void test1()
	{
		
	}
}
