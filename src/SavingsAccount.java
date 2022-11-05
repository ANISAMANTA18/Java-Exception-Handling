import java.util.*;
public class SavingsAccount extends Account
{
	private int interestRate;
	
	//Constructor
	public SavingsAccount()
	{
		super();
		interestRate=0;
	}
	public SavingsAccount(String name, long number, int balance,int r)
	{
		super(name,number,balance);
		if(getBalance()<500)
			System.out.println ("Initial Balance should be Rs. 500");
		interestRate=r;
	}
	
	//Accessor method
	public int getInterestRate()
	{
		return interestRate;
	}
	//Mutator method
	public void setInterestRate(int r)
	{
		interestRate=r;
	}
	
	public void computeInterest()
	{
		double interest=((getBalance()*interestRate)/100);
		setBalance(interest+getBalance());
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
		else if(getBalance()>=withdrawAmount)
		{
			setBalance(getBalance() - withdrawAmount);
			if (getBalance()<500)
				setBalance(getBalance()-10);
		}
		else
		{
			System.out.println ("Not enough money");
		}
	}
	public String toString()
	{
		return("Account holder name : "+getName()+"\nAccount number : "+getAccountNumber()+"\nBalance : "+getBalance()+"\nAccount type : S\n");
	}
}