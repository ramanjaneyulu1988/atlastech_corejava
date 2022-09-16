package conditions;

import java.util.Scanner;

public class ConditionsExample2 {

	public static void main(String[] args) {
		
		System.out.println("Enter any integer value equal/below 10");
		Scanner sc = new Scanner(System.in);
		int rating = sc.nextInt();
		System.out.println(rating);
		
		if(rating > 10 || rating < 1)
		{
			System.out.println("Entered value should be in between 1 to 10");
		}
		else if(rating == 10)
		{
			System.out.println("30% hike");
		}
		else if(rating == 8 || rating == 9)
		{
			System.out.println("20% hike");
		}
		else if(rating == 6 || rating == 7)
		{
			System.out.println("10% hike");
		}
		else if(rating == 5)
		{
			System.out.println("5% hike");
		}
		else
		{
			System.out.println("No hike");
		}
		
		sc.close();
	}
}
