package loops;

import java.util.Scanner;

public class DowhileLoopExample2 {

	public static void main(String[] args) {
		
		System.out.println("Addition logic..........");
		boolean b = false;
		do
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter any number");
			int i = sc.nextInt();
			
			System.out.println("Enter another number");
			int j = sc.nextInt();
			
			int k = i+j;
			System.out.println(k);
			
			sc.hasNextLine();
			
			System.out.println("Do you want to proceed: yes/no?");
			String decision = sc.next();
			if(decision.equalsIgnoreCase("yes"))
			{
				b = true;
			}
			else
			{
				System.out.println("Program terminated....");
				break;
			}
		}
		while(b);
	}
}
