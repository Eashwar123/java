class Math2020
{
	public int sum(int x,int y)
	{
		return(x+y);
	}
	protected int subt(int x,int y)
	{
		return(x-y);
	}
}

class Math2021 extends Math2020
{
	public int mult(int x,int y)
	{
		return(x*y);
	}
	public int subtract(int x,int y)
	{
		return subt(x,y);
	}
}

class program 
{
	public static void main(String args[])
	{
		Math2020 m1;
		Math2021 m2;
		m1=new Math2020();
		m2=new Math2021();
		System.out.println(m1.sum(10,30));
		System.out.println(m1.subt(75,30));
		//The above line probably fails because it's trying to access protected method.
		System.out.println(m2.mult(5,3));
		System.out.println(m2.subtract(80,60));	
		System.out.println(m2.subt(50,33));
		//The above line probably fails because it's trying to access protected method.
	}
}