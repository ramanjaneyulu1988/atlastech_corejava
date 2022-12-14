package stringtokenizer;

import java.util.StringTokenizer;

public class Example1 {

	public static void main(String[] args) {
		
		String city = "Hubli#Bangalore@Hyderabad$Chennai|Vizag#Mumbai&Pune";
		
		StringTokenizer st = new StringTokenizer(city, "#@$|&");
		
		while(st.hasMoreElements())
		{
			String s = (String) st.nextElement();
			if(!s.equalsIgnoreCase("Hyderabad"))
			{
				System.out.println(s);
			}
		}
	}
}
