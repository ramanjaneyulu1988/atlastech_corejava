package exception;

public class Example3 {

	public static void main(String[] args) {
		
		String s = "Bangalore";
		
		try
		{
			char c = s.charAt(20); // 
			System.out.println(c);
		}
		catch (NullPointerException e) {
			// TODO: handle exception
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.println("main method end...");
		
	}
}
