package string;

public class ReverseStringExample1 {

	public static void main(String[] args) {
		
		String s = "Newyark";
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		String reverse = sb.toString();
		System.out.println(reverse);
	}
}
