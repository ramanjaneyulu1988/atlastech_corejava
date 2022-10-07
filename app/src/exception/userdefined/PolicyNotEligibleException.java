package exception.userdefined;

public class PolicyNotEligibleException extends RuntimeException
{
	public PolicyNotEligibleException(String message)
	{
		super(message);
	}
}
