//ConstructorinInheritance
class parent
{
	public parent(int val)
	{
		System.out.println("From parent's constructor"+val);
	}
}
class child extends parent
{

	public child(int use)
	{
		super(use);
		System.out.println("From child's constructor"+use);
	}
}
class program
{
	public static void main(String args[])
	{
		parent p;
		child c;
		p=new parent(20);
		c=new child(10);
		//each object has its own instance
		
	}
}