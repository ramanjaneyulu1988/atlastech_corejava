package string;

public class StringExample1 {

	public static void main(String[] args) {
		
		String s = new String("abcxyz"); // This is creating Object using new keyword
		String s2 = new String("abcxyz"); // always it will create new Object
		
		int len = s.length();
		System.out.println(len);

		String name = "abc"; // This is also Object creation (String literal way of creating object)
		
		// String pool
		
		String s1 = "xyz";
	}
}
