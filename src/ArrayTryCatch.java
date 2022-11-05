import java.util.*;
public class ArrayTryCatch
{
	public static void main(String[]args)
	{
		int []arr =new int[10];
		int sum=0;
		try
		{
			for(int i=0;i<=10;i++)
			{
				arr[i]=i;
				sum+=arr[i];
				System.out.println ("Added number "+arr[i]);
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println ("\nArray is out of bounds "+ e.getMessage());
		}
		System.out.println ("Sum="+sum);
	}
}