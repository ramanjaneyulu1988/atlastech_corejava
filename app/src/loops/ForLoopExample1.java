package loops;

public class ForLoopExample1 {

	public static void main(String[] args) {
		
		int nums[] = {20, 40, 10, 15, 45, 50, 60};
		
		System.out.println(nums.length);

		System.out.println("Forward Direction.........");
		for(int i=0; i<nums.length; i++)
		{
			System.out.println(nums[i]);
		}
		
		System.out.println("Reverse Direction.............");
		for(int i=nums.length-1; i>=0; i--)
		{
			System.out.println(nums[i]);
		}
	}
}
