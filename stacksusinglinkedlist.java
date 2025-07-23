class Program
{
public static void main(String args[])
	{
	Stack<Integer> s;
	s=new <Integer>Stack();
	s.push(100);
	s.push(200);
	System.out.println(s.pop());
		while(hasNext())
		{
		System.out.println(s.next());
		}
       } 
}
class Stack<T>
{
private T i,n;
public Node first;
public Node fornext;
	public class Node
	{
		int Data;
		Node next;
		public Node(T val)
		{
			Data=val;
			next=null;
		}
	}
	public Stack(){
		first=null;
		fornext=null;
			}
	public void push(T d)
		{
		Node newnode=new Node(d);
		if(first==null)
			{
			first=newnode;
			fornext=newnode;
			}
		else
		 {
			fornext.next=newnode;
		}
	}

	public T pop(){
		T use=first.Data;
		first=first.next;
		return(use);
		}
	public boolean hasNext()
	{
				if(first==null)
				{
					return true;
				}
				else
				{
					return false;
				}
	}
	
	public T next()
	{
			return(first=first.next);
	}
}

