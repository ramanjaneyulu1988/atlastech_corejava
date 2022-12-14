package string;

public class StringExample2 {

	public static void main(String[] args) {
		
		String city = "Bangalore";
		
		int len = city.length();
		System.out.println(len);
		
		char c = city.charAt(8);
		System.out.println(c); // a
		
		String fname = "abc";
		String lname = "xyz";
		
		String name = fname.concat(" ").concat(lname);
		System.out.println(name);
		
		boolean b = city.contains("gal");
		System.out.println(b);
		
		boolean b1 = city.startsWith("Ba");
		System.out.println(b1);
		
		boolean b2 = city.endsWith("e");
		System.out.println(b2);
		
		boolean b3 = city.equals("bangalore");
		System.out.println(b3);
		
		boolean b4 = city.equalsIgnoreCase("bangalore");
		System.out.println(b4);
		
		
//		A ASCI value is 65
//		B is 66 .....
		
//		a ASCI value is 97
//		b is 98
		int i = city.compareTo("bangalore");
		if(i == 0)
		{
			System.out.println("Both Strings are same");
		}
		else
		{
			System.out.println("Both Strings are not same");
		}
		
		int j = city.compareToIgnoreCase("bangalore");
		if(j == 0)
		{
			System.out.println("Both Strings are same");
		}
		else
		{
			System.out.println("Both Strings are not same");
		}
		
		String subString1 = city.substring(0, 4); // Here, starting index is inclusive and ending index is exclusive
		System.out.println(subString1); //Bang
		
		String subString2 = city.substring(4); // If we don't specify ending index then it will take till end of the String
		System.out.println(subString2); // alore
		
	}
}
