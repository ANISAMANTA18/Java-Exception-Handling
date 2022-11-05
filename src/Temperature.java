import java.util.*;
public class Temperature
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);	
		boolean flag=true;
		while(flag==true) {
		System.out.println ("\nEnter 1 to Convert Fahrenheit to Celsius \nEnter 2 to Convert Celsius to Fahrenheit\nEnter 3 to exit\nEnter your choice:");
		int sw=sc.nextInt();
		try
		{
			switch(sw)
			{
				case 1:
				System.out.println("Enter the temperature in Fahrenheit is :");
				
				if(sc.hasNextDouble())
				{
					double fr=sc.nextDouble();
					double  cl=((fr-32)*5)/9;
					System.out.println ("\nTemperature in Celsius is : "+cl);
				}
				else
				{
					sc.next();
					throw new NumberFormatException();
				}
				continue;
				
				case 2:
				System.out.println("Enter the temperature in Celsius :");
				if(sc.hasNextDouble())
				{
					double c=sc.nextDouble();
					double f=(c*9/5)+32;
					System.out.println ("\nTemperature in Fahrenheit : "+f);
				}
				else
				{
					sc.next();
					throw new NumberFormatException();
				}
				continue;
				
				case 3:
				flag=false;
				continue;
				
				default:
				System.out.println ("Wrong input");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println ("\nNumber Format Exception");
		}
	}
	}
}