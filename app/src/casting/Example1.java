package casting;

public class Example1 {

	public static void main(String[] args) {
		
		int i = 10;
		long l = i; // converting from int (lower type) to long (higher type) - Auto upcasting
		
		
		double d = 50.60;
		float f = (float)d; // converting from double (higher type) to float (lower type) - Explicit downcasting
	}
}
