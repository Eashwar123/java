class Math
{
	public int sum(int x, int y)
	{
		return(x+y);
	}
		
	public float sum(float x, float y)
	{
		return(x+y);
	}
	
	public Double sum(Double x,Double y)
	{
		return(x+y);
	}
	public int sum(int x, int y,int z)
	{
		return(x+y+z);
	}
	public int sum(int x, String y)
	{
		return(x+Integer.parseInt(y));
	}
	public int sum(String x,int y)
	{
		return(Integer.parseInt(x)+y);
	}

	public String sum(String x, String y)
	{
		return(x+y);
	}
}
	
class program
{
	public static void main(String args[])
	{
		Math m;
		m=new Math();
		System.out.println(m.sum(100,200));
		System.out.println(m.sum(55.666,66.425));
		System.out.println(m.sum(33.89,89.234));
		System.out.println(m.sum(33,55,13));	
		System.out.pritnln(m.sum(22,"88"));
		System.out.println(m.sum("345",55));
		System.out.println(m.sum("hello","how are you"));
	}
}