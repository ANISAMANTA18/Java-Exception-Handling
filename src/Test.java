class Test
{
	public static void main(String [] args)
	{
		Stack<Integer> stk = new Stack<Integer>();
		for(int i=5;i<=75;i+=5) {
		try 
		{
			if (stk.push(i))
			System.out.println ("Pushed "+i);
		}
		catch(Exception e)
		{
			System.out.println (e);
		}
		}
		System.out.println (stk);
		
		while(stk.isEmpty()==false)
		{
			try 
			{
				if(stk.pop())
					System.out.println ("Popped element");
			}
			catch(Exception e)
			{
				System.out.println (e);
			}
			System.out.println (stk);
		}
	}
}