package string;

public class ImmutableExample {

	public static void main(String[] args) {
		
		String s = "abc";
		
		System.out.println(s.hashCode());
		
		// s -> abc
		
		s = s.concat("xyz");
		
		System.out.println(s.hashCode());
		
		System.out.println(s); // abc
		System.out.println(s); // abcxyz
		
		String s1 = "abc";
		System.out.println(s1.hashCode());
		
		String s2 = "abc";
		System.out.println(s2.hashCode());
	}
}
