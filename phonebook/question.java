import java.util.*;
class program
{
	public static void main(String args[])
	{
		Student s;
		s=new Student();
		ArrayList<Integer> use;
		use=new ArrayList<Integer>();
		s.setid(101);
		s.setname("alyosha");
		s.setfee(55000);
		use.add(101);
		use.add(65);
		use.add(66);
		marks m=new marks(use,id);

	}

}
class Student
{
	private int id;
	private String name;
	private Double fee;
	public void setid(int no)
	{	
		id=no;
	}
	public void setname(String ok)
	{
		name=ok;
	}	
	public void setfee(Double sal)
	{
		fee=sal;
	}

	public int getid()
	{
		return(id);
	}
	


}
class marks extends Student
{
	ArrayList<Integer> alist;
	private int id;
	private int m1;
	private int m2;
	private int m3;
	Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
	public marks(ArrayList<Integer> al,int idcard)
	{
		id=idcard;
		alist=al;
	}

	
	ht.put("marks1",alist.get(0));
	ht.put("marks2",alist.get(1));
	ht.put("marks3",alist.get(2));

	Collection<Integer> c=ht.values();
	Iterator<Integer> itr=c.iterator();
		while(!itr.hasNext())
		{
			System.out.println(itr.next());
		}
}