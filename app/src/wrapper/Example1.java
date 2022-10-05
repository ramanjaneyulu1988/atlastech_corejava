package wrapper;

public class Example1 {

	public static Double price;
	
	public static void main(String[] args) {
		
		System.out.println(price);
		
		double d = 45.0;
		
		String s = Double.toString(d);
		double d1 = Double.parseDouble(s);
		
		System.out.println(d1);
	}
}
