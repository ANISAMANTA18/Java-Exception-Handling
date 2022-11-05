import java.util.*;
public class FractionLoop
{
	public static void main(String [] args)
	{
		double f;
		int n,d;
		Random randomNum=new Random();
		for (int i=1;i<=10;i++)
		{
			try
			{
				n=1+randomNum.nextInt(10);
				//System.out.println (n);		
				d=0+randomNum.nextInt(5);
				//System.out.println (d);
				if(d==0)
				{
					throw new ArithmeticException();
				}
				else
				f=(double)n/(double)d;
				System.out.println("\nFraction = "+n+"/"+d +"="+ f);
			}
			catch(ArithmeticException e)
			{
				System.out.println ("\nDivide by zero");
			}
			finally
			{
				System.out.println ("\nEnd of iteration "+i);
			}
		}
	}
}