package loops;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("Calculate Simple interest");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter price");
		double price = sc.nextDouble();
		
		System.out.println("Enter interest");
		double interest = sc.nextDouble();
		
		System.out.println("Enter time");
		int time = sc.nextInt();
		
		double si = (price*time*interest)/100;
		System.out.println(si);
	}
}
