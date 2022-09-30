package exception;

public class Example2 {

	public static void main(String[] args) {
		
		String fname = null;
		try
		{
			String s1 = fname.concat("xyz");
			System.out.println(s1);
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("main method end");
		
	}
}
