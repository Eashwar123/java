
class Stack extends Iterator
{
	public Object o[];
	public int i,n;
	
	
	
	
	public Stack()
	{
		o=new Object[10];
		i=0;
	}
	
	public void push(Object use)
	{
		o[i]=use;
		i++;
	}
	public Object pop()
	{
		i--;
		return(o[i]);
	}
	/*public boolean isEmpty()
	{
		if(i==o.length)
		{
			return(true);
		}	
		return(false);
	}
	*/
	public boolean hasNext()
	{
		if(i!=n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public Object next()
	{
		return(o[i--]);
	}
}
abstract class Iterator
{
public abstract boolean hasNext();
public abstract Object next();
}

class program
{
	public static void main(String args[])
	{
		Iterator itr;
		
		Object c=new Object();
		Stack s=new Stack();
		itr=s;
		s.push(150);
		s.push(22.2);
		s.push("hellowhhatsgood");
		while(s.hasNext())
		{
		System.out.println(s.next());
		}
	}
}