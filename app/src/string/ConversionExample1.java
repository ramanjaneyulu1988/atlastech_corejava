package string;

public class ConversionExample1 {

	public static void main(String[] args) {
		
		String s = "abc";
		
		System.out.println(s);
		
		// Converting from String to StringBuffer
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb);
		
		// Converting from StringBuffer to String
		String s1 = sb.toString();
		System.out.println(s1);
		
	}
}
