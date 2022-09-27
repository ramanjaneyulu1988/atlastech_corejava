package string;

public class StringExample4 {

	public static void main(String[] args) {
	
		String s = "Bangalore";
		
		int i = s.indexOf('l');
		System.out.println(i); // 1
		
		int j = s.lastIndexOf('l');
		System.out.println(j); // 4
		
		StringExample4.findIndex(s, 'a', 5);
		
	}
	
	public static int findIndex(String s, char c, int occuranceValue)
	{
		int count = 0;
		int index = -1;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == c)
			{
				count ++;
			}
			
			if(count == occuranceValue)
			{
				index = i;
				System.out.println(i);
				break;
			}
		}
		
		return index;
	}
	
}
