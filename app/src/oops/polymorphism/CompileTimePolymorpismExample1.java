package oops.polymorphism;

public class CompileTimePolymorpismExample1 {

	public static void main(String[] args) {
		
		CompileTimePolymorpismExample1.login("abc", "xyz");
	}
	
	public static void login(String username, String password)
	{
		System.out.println("login method with 2 parameters...");
	}
	
	public static void login(String username, String password, String type)
	{
		System.out.println("login method with 3 parameters...");
	}
}
