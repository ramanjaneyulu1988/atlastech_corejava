package string;

public class ImmutableExample1 {

	public static void main(String[] args) {
		
		String s = "abc";
		
		s = s.concat("xyz");
		
		StringBuffer sb = new StringBuffer("Alex");
		
		sb.append("Rak");
		sb.append("Raj");
		
		
		StringBuffer sb1 = new StringBuffer("Ram");
	}
}
