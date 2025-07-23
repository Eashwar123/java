interface IMath{
	public int sum(int x,int y);
	//abstract method
}
/*class Math implements IMath
{
	public int sum(int x,int y)
	{
		return(x+y);
	}

}*/

class interface_lamda
{
	public static void main(String args[])
	{
		IMath m;
		/*m=new IMath(){
			public int sum(int x,int y)
				{
					return(x+y);	
				}

			}
		*/
		m=(x,y)->{
				return(x+y);
			 };
		
		System.out.println(m.sum(50,30));
	}
}