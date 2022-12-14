package conditions;

import java.util.Scanner;

public class ConditionsExample3 {

	public static void main(String[] args) {
		
		System.out.println("Enter any integer value equal/below 10");
		Scanner sc = new Scanner(System.in);
		int rating = sc.nextInt();
		
		switch (rating) {
		
		case 10:
			System.out.println("30% hike");
			break;

		case 8 : case 9:
			System.out.println("20% hike");
			break;
			
		case 6: case 7:
			System.out.println("10% hike");
			break;
			
		case 5:
			System.out.println("5% hike");
			break;
			
		default:
			System.out.println("No Hike");
			break;
		}
		
		sc.close();
	}
}
