class Linkedlist
{
	private Node first,nextlol;
	private int i,u=0;
	
	class Node
	{
	
		private int data;
		public Node prev,next;
		
		public Node(int val)
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
	public void add(int use)
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
	public int get()
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
		return(false);
		}
	}
	
}
class program
{
	public static void main(String args[])
	{
		Linkedlist l=new Linkedlist();
		l.add(200);
		l.add(400);
		l.add(5000);
		System.out.println("Something");
		while(!l.isEmpty())
		{
			System.out.println(l.get());
		}
	}

}
