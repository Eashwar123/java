class Outer
{

	public int subt(int x, int y)
	{
		return x-y;
	}
	class Inner
	{
		public int sum(int x,int y)
		{
			return x+y;
		}

	}	

}
class program
{
	public static void main(String args[])
	{
		Outer o=new Outer();
		Outer.Inner i=o.new Inner();
		System.out.println(o.subt(100,50));
		System.out.println(i.sum(200,100));
	}
}