package string;

public class StringExample5 {

	public static void main(String[] args) {
		
		String s = "Bangalore";
		
		System.out.println(s.length()); // 1
		
		boolean b = s.isBlank();
		System.out.println(b); // true
		
		boolean b1 = s.isEmpty();
		System.out.println(b1); // false
		
		String s1 = s.toUpperCase();
		System.out.println(s1);
		
		String s2 = s.toLowerCase();
		System.out.println(s2);
		
	}
}
