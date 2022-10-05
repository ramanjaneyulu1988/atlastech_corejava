package exception;

import java.util.InputMismatchException;

public class Example6 {

	public static void main(String[] args) {
		
		System.out.println("main methos start");
		
		try
		{
			System.out.println("try block");
			
			int k = 20/0;
			System.out.println(k);
		}
		catch(NullPointerException e)
		{
			System.out.println("1");
		}
		catch(InputMismatchException e)
		{
			System.out.println("2");
		}
		catch(ArithmeticException e)
		{
			System.out.println("3");
		}
		catch (Exception e) {
			System.out.println("4");
		}
		
		System.out.println("main method end");
	}
}
