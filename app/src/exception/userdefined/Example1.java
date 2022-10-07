package exception.userdefined;

public class Example1 
{
	public static void main(String[] args) 
	{
		double bankBalance = 20000.0;
		double withdraw = 25000.0;
		
		if(withdraw > bankBalance)
		{
			// throw is a keyword and it is used for raise the Exception explicitly
			throw new BankBalanceNotSufficientException("Trying with draw amount is grater than bank balance");
		}
		else
		{
			System.out.println("With draw amount success....");
		}
	}
}
