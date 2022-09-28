package string;

public class ReverseStringExample2 {

	public static void main(String[] args) {
		
		String s = "Newyark";
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder();
		for(int i=s.length()-1; i >= 0; i--)
		{
			sb.append(s.charAt(i));
		}
		
		String reverse = sb.toString();
		System.out.println(reverse);
	}
}
