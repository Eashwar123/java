class program
{
	public static void main(String args[])
	{	
		List l;
		int n;
		l=new List();
		System.out.println("no of array blocks you want to create");
		n=Integer.parseInt(System.console().readLine());
		l.init(n);
		
		l.read();
		l.print();
	}

}

class List
{
	private int x[];
	private int i;
	public void init(int val)
	{
		x=new int[val];
		i=0;
	}
	public void init()
	{
		x=new int[10];
		i=0;
	}
	public void read()
	{
		for(int t=0;t<x.length;t++)
		{
			x[i]=Integer.parseInt(System.console().readLine());
			i++;
		}
			
	}
	
	public void print()
	{
		for(int k=0;k<x.length;k++)
		{
			System.out.println(x[i]);
		}
	}
}