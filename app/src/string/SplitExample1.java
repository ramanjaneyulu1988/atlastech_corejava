package string;

public class SplitExample1 {

	public static void main(String[] args) {
		
		String city = "Hubli#Bangalore@Hyderabad$Chennai|Vizag#Mumbai";
		
		String cities[] = city.split("#");
		for(int i=0; i<cities.length; i++)
		{
			System.out.println(cities[i]);
		}
	}
}
