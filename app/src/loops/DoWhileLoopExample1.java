package loops;

import java.util.Scanner;

public class DoWhileLoopExample1 {

	public static void main(String[] args) {
		
		DoWhileLoopExample1.calculateSimpleInterest();
	}
	
	public static void calculateSimpleInterest()
	{
		boolean b = false;
		System.out.println("Calculate Simple interest");
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter price");
			double price = sc.nextDouble();
			
			System.out.println("Enter interest");
			double interest = sc.nextDouble();
			
			System.out.println("Enter time");
			int time = sc.nextInt();
			
			sc.nextLine();
			
			double si = (price*time*interest)/100;
			System.out.println(si);
			
			System.out.println("Do you want to proceed yes/no...");
			String decision = sc.nextLine();
			
			if(decision.equalsIgnoreCase("yes"))
			{
				b = true;
			}
			else
			{
				break;
			}
		}
		while(b);
		
		sc.close();
	}
}
