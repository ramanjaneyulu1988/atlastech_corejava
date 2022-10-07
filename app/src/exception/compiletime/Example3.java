package exception.compiletime;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		Example3 example3 = new Example3();
		
		System.out.println(example3.test()); // 3
		
		String name = example3.combiningTwoStrings();
		System.out.println(name);
	}
	
	public int test()
	{
		String s = null;
		try
		{
//			return 1;
		}
		catch (Exception e) 
		{
			return 2;
		}
		finally
		{
			return 3;
		}
		
//		return 4;
	}
	
	public String combiningTwoStrings()
	{
		String name = "";
		try
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter first name");
			String fname = sc.nextLine();
			
			System.out.println("Enter last name");
			String lname = sc.nextLine();
			
			name = fname.concat(" ").concat(lname);
			
			
		}
		catch (Exception e) {
			
		}
		finally
		{
			return name;
		}
	}
}
