import java.util.*;
public class CurrentAccount extends Account
{
	private int overDraftLimit;
		
	//Constructor
	public CurrentAccount()
	{
		super();
		overDraftLimit=0;
	}
	public CurrentAccount(String name, long number, int balance,int o)
	{
		super(name,number,balance);
		if(getBalance()<5000)
			System.out.println ("Initial Balance should be Rs. 5000");
		overDraftLimit=o;
	}
	
	//Accessor method
	public int getOverDraftLimit()
	{
		return overDraftLimit;
	}
	//Mutator method
	public void setOverDraftLimit(int o)
	{
		overDraftLimit=o;
	}
	
	public void depositMoney(double depositAmount)
	{
		if(depositAmount<0)
		    return ;
		else
			setBalance(getBalance() + depositAmount);
	}
	public void withdrawMoney(double withdrawAmount)
	{
		if (withdrawAmount<0)
		{
			return ;
		}
		else if(getBalance()+overDraftLimit < withdrawAmount)
		{
			if(overDraftLimit==0)
			{
				System.out.println ("Not enough money");
			}
			else {
			setBalance(getBalance()+overDraftLimit - withdrawAmount);
			setBalance(getBalance()-50);
			overDraftLimit=0; } 
		}
		else  if(getBalance()+overDraftLimit > withdrawAmount)
		{
			setBalance(getBalance()+overDraftLimit - withdrawAmount);
		}
	}
	public String toString()
	{
		return("Account holder name : "+getName()+"\nAccount number : "+getAccountNumber()+"\nBalance : "+getBalance()+"\nAccount type : C\n");
	}
}