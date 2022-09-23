package string;

public class StringExample3 {

	public static void main(String[] args) {
		
		String city = "Bangalore#Hyderab#Chennai#Vizag#Hubli#Mumbai#Delhi#Bagpoor";
		System.out.println(city);
		
		String str[] = city.split("#");
		System.out.println(str.length);
		
		for(int i=0; i<str.length; i++)
		{
			if(str[i].startsWith("B"))
			{
				System.out.println(str[i]);
			}
		}
		
	}
}
