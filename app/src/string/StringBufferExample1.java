package string;

public class StringBufferExample1 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
//		StringBuilder sb = new StringBuilder();
		
		sb.append("abc");
		System.out.println(sb.hashCode());
		sb.append("xyz");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		
		sb.reverse(); // reverse method is not available in String class
		System.out.println(sb);
		
		int length = sb.length();
		System.out.println(length);
		
		int index = sb.indexOf("c");
		System.out.println(index);
		
		String s = sb.substring(0, 3);
		System.out.println(s);
		
		char c = sb.charAt(5);
		System.out.println(c);
	}
	
}
