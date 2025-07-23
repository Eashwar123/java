//Object is the base class of all the classes in java. So all classes extends Object by default.

class product extends Object
{
	private int pid;
	private String pname;
	private Double price;
	public void read()
	{
		pid=Integer.parseInt(System.console().readLine());
		pname=System.console().readLine();
		price=Double.parseDouble(System.console().readLine());
	}
	public void print()
	{
		System.console().printf("%d\n %s\n %f\n", pid,pname,price);
	}
	public String toString()
	{
		return pid+","+pname+","+price;

	}


}
//question:why do we extend product. Why are we overriding methods here.
class Employee extends Object
{
	private int eid;
	private String ename;
	private Double salary;
	public void read()
	{
		eid=Integer.parseInt(System.console().readLine());
		ename=System.console().readLine();
		salary=Double.parseDouble(System.console().readLine());
	}
	public void print()	
	{
		System.console().printf("%d\n %s\n %f\n",eid,ename,salary);
	}
	
}
class program
{
	public static void main(String args[])
	{
		product p;
		Employee e;
		Object c=new Object();
		Object h;
		p=new product();
		e=new Employee();
		List l;
		l=new List();
		p.read();
		e.read();
		l.add(p);
		l.add(e);
		l.add(22);
		l.add("ReySuresh");
		l.add(55.678);
		if(c==p)
		{
			((product)c).print();
		}
		else if(c==e)
		{
			((Employee)c).print();
		}
		else 
		{
			System.out.println(c);
		}
		for(int d=0;d<5;d++)
		{
			h=l.get();
		
			System.out.println(h);
		}
		
	}	
}
//let us write a class for list
class List 
{
	private Object o[];
	public int i;
	public List()
	{
		o=new Object[10];
		i=0;
	}
	public void add(Object use)
	{
		o[i]=use;
		i++;
	}
	public Object get()
	{
		i--;
		return(o[i]);
	}

}

	