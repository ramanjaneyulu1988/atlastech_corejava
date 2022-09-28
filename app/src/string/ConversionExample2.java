package string;

public class ConversionExample2 {

	public static void main(String[] args) {

		String s = "abc";

		System.out.println(s);

		// Converting from String to StringBuilder
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb);

		// Converting from StringBuilder to String
		String s1 = sb.toString();
		System.out.println(s1);

	}
}
