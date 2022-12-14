package string;

public class StringExample4 {

	public static void main(String[] args) {
	
		String s = "Bangaloreabcxyzaeab";
		
		int i = s.indexOf('l');
		System.out.println(i); // 1
		
		int j = s.lastIndexOf('l');
		System.out.println(j); // 4
		
		int index = StringExample4.findIndex(s, 'e', 2);
		if(index == -100)
		{
			System.out.println("Those many occurances are not there..");
		}
		else
		{
			System.out.println(index);
		}
	}
	
	public static int findIndex(String s, char c, int occuranceValue)
	{
		int count = 0;
		int index = -100;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == c)
			{
				count ++;
			}
			
			if(count == occuranceValue)
			{
				index = i;
				break;
			}
		}
		
		return index;
	}
	
}
