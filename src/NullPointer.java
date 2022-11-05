import java.util.*;
class NullPointer
{
	public static void main(String[]args)
	{
		String s=null;
		try
		{
			if(s.equals("hello"))
				System.out.println ("Matched");
			else
				System.out.println ("Not matched");
		}
		catch(NullPointerException e)
		{
			System.out.println ("Null Pointer Exception");
		}
		finally
		{
			System.out.println ("Program has ended");
		}
	}
}