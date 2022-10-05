package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		try
		{
			System.out.println("Enter any integer value");
			i = sc.nextInt();
			
			System.out.println("Enter another integer value");
			j = sc.nextInt();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		int k = i+j;
		System.out.println(k);
		
		System.out.println("main method end...");
		
	}
}
