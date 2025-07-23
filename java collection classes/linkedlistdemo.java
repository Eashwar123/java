import java.util.*;

class program1
{
	public static void main(String args[])
	{
		LinkedList<String> l=new LinkedList<String>();
		l.add("Hello");
		l.add("Takasugi");
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("Gintoki");
		list2.add("Gintama");
		
		Iterator<Integer> itr=list.iterator();
		//iterator() returns an iterator 
		l.addAll(1,list2);
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}	

		itr=descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		
		/*for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}*/
	}
}