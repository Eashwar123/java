class product 
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
	public int getid()
	{
		return(pid);
	}

}
//question:why do we extend product. Why are we overriding methods here.
class Employee extends product
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
	public int getid()
	{	
		return(eid);
	}
}
class program
{
	public static void main(String args[])
	{
		product p;
		Employee e;
		boolean boo;
		p=new product();
		e=new Employee();
		List l;
		l=new List();
		p.read();
		e.read();
		l.add(p);
		l.add(e);
		for(int b=0;b<2;b++)
		{
			l.get().print();
		}
		boo=l.search(53);
		 System.out.println(boo);
		
	}	
}
//let us write a class for list
class List
{
	private product prod[];
	public int i;
	public List()
	{
		prod=new product[5];
		i=0;
	}
	public void add(product use)
	{
		prod[i]=use;
		i++;
	}
	public product get()
	{
		i--;
		return(prod[i]);
	}

	public boolean search(int h)
	{
		for(i=0;i<2;i++)
		{
			if(prod[i].getid()==h)
			{
				return true;
				
			}
		}
		return(false);
	}
	
		
	
}