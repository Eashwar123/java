class Product
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
		System.out.printf("%d\n %s\n %f",pid,pname,price);
	}
	public int getid()
	{
		return(pid);
	}

}

class program
{
	public static void main(String args[])
	{
		Product p1,p2,p3,p4;
		List l;
		l=new List();
		p1=new Product();
		p2=new Product();
		p3=new Product();
		p1.read();	
		p2.read();
		p3.read();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		for(int k=0;k<3;k++)
		{
		p4=l.get();
		p4.print();
		System.out.println(p4);
		}
		Product t;
		t=l.find(630);
		t.print();
		
		
	}
}
class List
{
	Product x[];
	int i;
	public List()
	{
		x=new Product[3];
		i=0;
	}
	public void add(Product t)
	{
		x[i]=t;
		i++;
	}

	public Product get()
	{
		i--;
		return(x[i]);
	
	}
	public Product find(int val)
	{
		for(int k=0;k<3;k++)
		{
			if(val==x[k].getid())
			{
				return(x[k]);

			}
		}	
		return(null);	

	}
	
}
