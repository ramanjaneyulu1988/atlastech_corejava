package exception.compiletime;

public class Example3 {

	public static void main(String[] args) {
		
		Example3 example3 = new Example3();
		
		System.out.println(example3.test()); // 3
	}
	
	public int test()
	{
		String s = null;
		try
		{
//			return 1;
		}
		catch (Exception e) 
		{
			return 2;
		}
		finally
		{
			return 3;
		}
		
//		return 4;
	}
}
