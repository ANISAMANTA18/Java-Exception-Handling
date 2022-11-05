import java.util.*;
public class Name
{
	public static boolean validName(String name)
	{
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(!Character.isLetter(ch))
			{
				if(ch!=' ')
					throw new InputMismatchException();
			}
		}
		return true;
	}
	public static void main(String[]args)
	{
		try 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println ("Enter your name : ");
			String s=sc.nextLine();
			if(validName(s))
				System.out.println ("\nThe name is Valid.");
		}
		catch(InputMismatchException e)
		{
			System.out.println ("\nThe name is not Valid!");
		}
	}	
}