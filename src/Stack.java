class Stack <T>
{
	private T arr[];
	private int top;
	
	public Stack()
	{
		arr=(T[])(new Object [10]);
		top=0;
	}
	public boolean isEmpty()
	{
		return top==0;
	}
	public boolean isFull()
	{
		return top==arr.length;
	}
	public boolean push(T e) throws FullStackException
	{
		if(isFull())
			throw new FullStackException("Stack is Full");
		arr[top]=e;
		top++;
		return true;
	}
	public boolean pop() throws EmptyStackException
	{
		if(isEmpty())
			throw new EmptyStackException("Stack is Empty");
		else
		{
			top--;
			return true;
		}
	}
	public T peek()
	{
		return arr[top-1];
	}
	public String toString()
	{
		String str="[";
		int i;
		for(i=0;i<top-1;i++)
			str+=arr[i]+",";
		str+=arr[i]+"]";
		return str;
	}
}