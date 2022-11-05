import java.util.*;
public class TestMath
{
	int value;
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println ("Enter a value");
		int n=sc.nextInt();
		try 
		{
			try
			{
				if(n>100)
					throw new OverFlowException("OverFlow");
				else if (n<0)
					throw new UnderFlowException("UnderFlow");
				else
					System.out.println ("Value is within the range");
			}
			catch(UnderFlowException e)
			{
				throw e;
			}
			catch(OverFlowException e)
			{
				System.out.println (e);
			}	
		}
		catch(MathException e)
		{
			System.out.println (e);
		}
	}
}