import java.util.*;


class program
{
	public static void main(String args[])
	{

		ArrayList<String> al=new ArrayList<String>();
		al.add("Takasugi");
		al.add("morgana");
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("gintoki");
		al2.add("Kagura");
		al.addAll(1,al2);	
		/*for(int i=0;i<al.size();i++)
		{
		System.out.println("The elements in the arraylist:"+al.get(i));
		}*/
		Iterator<String> itr;
		itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(al.size());
		//forEach syntax:
		for(String use: al)
		{
			System.out.println(use);
		}
		

	}
}