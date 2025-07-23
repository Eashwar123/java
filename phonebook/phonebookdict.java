import java.util.*;

class Phonebook
{
	public String name;
	public String phonenumber;
	public void set(String use)
	{
		name=use;
	}
	public String get()
	{
		return(name);
	}
	public char returnFirstLetter()
	{
		return name.charAt(0);
	}
	public void setnum(Double help)
	{
		phonenumber=String.valueOf(help);
	}
	public Phonebook getnum()
	{
		return(phonenumber);
	}
	//get and set methods are set
}
class program 
{
	public static void main(String args[])
	{
		String st;
		Double st2;
		char wtf;
		Phonebook pb=new Phonebook();
		st=System.console().readLine();
		System.out.println("Enter phone number");
		st2=Double.parseDouble(System.console().readLine());
		pb.set(st);
		pb.setnum(st2);
		HashTable<char,ArrayList<Phonebook>> ht=new Hashtable<char,ArrayList<Phonebook>>();
		wtf=pb.returnFirstLetter();
		ArrayList<Phonebook> al=new ArrayList<Phonebook>();
		al.add(pb.get());
		al.add(pb.getnum());
		if(!containsKey(wtf))
		{
			wtf=pb.returnFirstLetter();
			ht.put(wtf,al);
		}
		else
		{
			ht.put(wtf,al);
		}
		Collection<String> c=ht.values();
		Iterator<String> itr=c.iterator();
		while(!ht.isEmpty())
		{
			System.out.println(itr.next());
		}
		
		
		
	}


}