package exception.userdefined;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		if(age < 5 || age > 55)
		{
			throw new PolicyNotEligibleException("This policy is not applicable for this age");
		}
		else
		{
			System.out.println("Your elible fot this policy, You can opt this");
		}
	}
}
