class Program
{
public static void main(String args[])
	{
	Linkedlist<Integer> l;
	l=new <Integer>Linkedlist();
	l.add(100);
	l.add(200);
	
		while(!l.isEmpty())
		{
		System.out.println(l.get());
		}
       } 
}
class Linkedlist<T>
{
	private Node first,nextlol;
	private T i,u;
	
	class Node
	{
	
		private T data;
		public Node prev,next;
		
		public Node(T val)
		{
		
		
		data=val;
		next=null;	
			
		}
	}
	public Linkedlist()
	{
		
		first=null;
		nextlol=null;		
		
	}	
	public void add(T use)
	{
		Node newnode=new Node(use);
		if(first==null)
		{
			first=newnode;
			nextlol=newnode;
		}
		else 
		{
			nextlol.next=newnode;
		}
			
	}
	public T get()
	{
			Node use=first;
			first=first.next;
			return(use.data);
		
			
	}
	public boolean isEmpty()
	{
		
			if(first==null)
			{
				return true;
			}
			else
			{
				return(false);
			}
	}
	public boolean hasNext()
	{
		if(first==null)
		{
			
			return false;	
		}	
		else
		{
		return(true);
		}
	}
	
}

