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
		List l;
		l=new List();
		p.read();
		e.read();
		l.add(p);
		l.add(e);
		for(int d=0;d<2;d++)
		{
			l.get().print();
			
		}
		
		
	}	
}
//let us write a class for list
class List 
{
	private Base b[];
	public int i;
	public List()
	{
		b=new Base[5];
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
	public Base()
	{
		prod=new product[5];
		em=new Employee[5];
	}
	public void print()
	{
	}
}