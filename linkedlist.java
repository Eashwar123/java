class Program{
	public static void main(String args[])
		{
		Linkedlist l;
		l=new Linkedlist();
		l.add(55);
		l.add(66);
while(!l.isEmpty()){

System.out.println(l.get());
	}
}
}



class Linkedlist{
	
	private Node first;
	private Node fornext;
	private Linkedlist h;
 		  private class Node{
   			int Data;
  			Node next;

				public Node(int j)
					{
					Data=j;
		     	                next=null;
					}
				}
		
	    

	public Linkedlist(){
			first=null;
			fornext=null;
			}
	public void add(int use)
		{
		Node newnode=new Node(use);
		if(first==null){
		first=newnode;
		fornext=first;
		}

		else{
			fornext.next=newnode;
   		}
	}

public int get(){
int help=first.Data;
first=first.next;
return(help);
}
public boolean isEmpty(){
return first==null;
}
}




