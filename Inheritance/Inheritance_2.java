class parent
{
	public void print()
	{
		System.out.println("From parent's print");
	}
}
class child extends parent
{
	public void print()
	{
		super.print();
		//how you would access the base class's method.
		System.out.println("from child's print");	
		
		
	}
}
class program
{
	public static void main(String args[])
	{
		parent p;
		child c;
		c=new child();
		p=new parent();
		p.print();
		c.print();
	}

}