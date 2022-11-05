import java.util.*;
class Account
{
	private static int numOfTransactions=0;
	private String holderName;
	private long accountNumber;
	private double balanceAmount;
	public Account()
	{
		holderName="";
		accountNumber=0;
		balanceAmount=0;
	}
	public Account(String name,long number,double balance)
	{
		holderName=name;
		accountNumber=number;
		balanceAmount=balance;
	}
	public static int getTransactionCount()
	{
		return numOfTransactions;
	}
	public long getAccountNumber()
	{
		return accountNumber;
	}
	public String getName()
	{
		return holderName;
	}
	
	public double getBalance()
	{
		return balanceAmount;
	}
	public void setName(String name)
	{
		holderName=name;
	}
	public void setAccountNumber(long number)
	{
		accountNumber=number;
	}
	public void setBalance(double balance)
	{
		balanceAmount=balance;
	}
	public void depositMoney(double depositAmount)
	{
		balanceAmount += depositAmount;
		numOfTransactions++;
	}
	public void withdrawMoney(double withdrawAmount)
	{
		if(balanceAmount>=withdrawAmount)
		{
			balanceAmount-=withdrawAmount;
			numOfTransactions++;
		}
		else
		{
			System.out.println ("Not enough money");
		}
	}
	public String toString()
	{
		return("Account holder name : "+holderName+"\nAccount number : "+accountNumber+"\nBalance : "+balanceAmount+"\n");
	}
}
