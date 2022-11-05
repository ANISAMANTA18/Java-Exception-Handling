import java.util.*;
import java.io.*;
public class TestBankingSystem
{
	public static void main(String[]args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		
		FileWriter fw=new FileWriter("Output.txt");
		
		System.out.println ("Enter the account name : ");
		String name =sc.nextLine();
		System.out.println("Enter the account number : ");
		long acc=sc.nextLong();
		System.out.println ("Enter the account balance : ");
		int bal=sc.nextInt();
		System.out.println ("Enter the account type : ");
		char type=sc.next().charAt(0);
		if(type=='S')
		{
			System.out.println ("Enter interest rate : ");
			int r=sc.nextInt();
			SavingsAccount ob1=new SavingsAccount(name,acc,bal,r);
			System.out.println ("\n"+ob1);
			fw.write(ob1+"\n");
			
			ob1.withdrawMoney(5000);
			System.out.println ("\n"+ob1);
			fw.write(ob1+"\n");
		}
		else if(type=='C')
		{
			System.out.println ("Enter over draft limit : ");
			int o=sc.nextInt();
			CurrentAccount ob2=new CurrentAccount(name,acc,bal,o);
			System.out.println ("\n"+ob2);
			fw.write(ob2+"\n");
			
			ob2.withdrawMoney(5000);
			System.out.println ("\n"+ob2);
			fw.write(ob2+"\n");
		}
		else 
			System.out.println ("Invalid account type");
			
		fw.close();
	}
}