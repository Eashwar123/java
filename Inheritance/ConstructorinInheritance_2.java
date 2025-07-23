class Parent
{
	public Parent(int val)
	{
		System.out.println("parent's const with parameter"+val);
	}
	
}
class Child extends Parent
{
	public Child(int val)
	{
		super(val/2);

//super() is used to call the base class constructor. It should be the first line in the child constructor.

		System.out.println("child's const with parameter"+" "+val);

	}
}

class program
{
	public static void main(String args[])
	{
		Child ch;
		Parent pa;
		//child can hold the parent's instance, but a child cannot hold the parent's instance.
		pa=new Child(50);
		ch=new Child(30);
	
	}
}