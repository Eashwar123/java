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
	public boolean equals(Object f)
	{
		if(pid==(int)f)
		{
			return(true);
		}
		return(false);
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
	public boolean equals(Object g)
	{
		if(eid==(int)g)
		{
			return(true);
		}
		return(false);
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
		Object n=l.find(1001);
		System.out.println(n);
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
	public Object find(int val)
	{
		for(i=0;i<5;i++)
		{
			if(o[i].equals(val))
			{
				return(o[i]);
			}
		}
		return(null);
	}
	public Object get()
	{
		i--;
		return(o[i]);
	}

}

	