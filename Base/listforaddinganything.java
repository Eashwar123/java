class product extends Base
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
	

}
//question:why do we extend product. Why are we overriding methods here.
class Employee extends Base
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
		boolean boo;
		Base mid= new Base();
		p=new product();
		e=new Employee();
		Integer i;
		i=new Integer();
		List l;
		l=new List();
		p.read();
		e.read();
		l.add(p);
		l.add(e);
		l.add(22);
		/*l.add(new String("ReySuresh"));
		l.add(new Double(55.678));*/
		for(int d=0;d<5;d++)
		{
			l.get().print();
			
		}
		/*
			for(int e=0;e<5;e++)
			{
				Base g;
				g=l.get();
				g.print();
			}
		*/
		
	}	
}
//let us write a class for list
class List 
{
	private Base b[];
	public int i;
	public List()
	{
		b=new Base[10];
		i=0;
	}
	public void add(Base use)
	{
		b[i]=use;
		i++;
	}
	public Base get()
	{
		i--;
		return(b[i]);
	}

}
class Base
{
	private product prod[];
	private Employee em[];
	private Integer it[];
	public Base()
	{
		prod=new product[5];
		em=new Employee[5];
		it=new Integer[5];

	}
	public void read()
	{
	}

	public void print()
	{
	}
}

class Integer extends Base
{
	private int x;
	public Integer(int val)
	{	
		x=val;
	}
	public void print()
	{
		System.out.println(x);
	}


}
class String extends Base
{
	private String st;
	public String(String use)
	{
		st=use;
	}
	public void print()
	{
		System.out.println(st);
	}
}
class Double extends Base
{
	private Double dou;
	public Double(Double copy)
	{
		dou=copy;
	}
	public void print()
	{
		System.out.println(dou);
	}

}