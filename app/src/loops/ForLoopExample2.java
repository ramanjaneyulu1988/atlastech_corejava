package loops;

public class ForLoopExample2 {

	public static void main(String[] args) {
		
		int arr[] = {2, 3, 4,5,6,7,8,9,10};
		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<nums.length; j++)
			{
				if(nums[j] != 5)
				{
					System.out.println(arr[i]+"*"+nums[j]+"="+arr[i]*nums[j]);
				}
			}
			
			System.out.println("====================================");
		}
	}
}
