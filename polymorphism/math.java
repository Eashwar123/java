class Math
{
	private int data;
	public Math(int val)
	{
		data=val;
	}
	public Math()
	{
		data=0;
	}
	public Math sum(Math m)
	{
		Math t;
		
		t=new Math();//normally would show error because the only constructor we have is with parameter if we didn't overload.

		t.data=data+m.data;

		return(t);
	}
	public void print()
	{
		System.out.println(data);

	}
}

class program
{
	public static void main(String args[])
	{
		Math m1,m2,m3;
		m1=new Math(100);
		m2=new Math(200);
		m3=m1.sum(m2);
		m3.print();
	}

}