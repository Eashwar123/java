 class arr_search
{
	public static void main(String args[])
	{
		int x[];
		int i,n,search;
		System.out.println("no of nodes you want to create:");	
		n=Integer.parseInt(System.console().readLine());
		//create instance
		x=new int[n];
		
		for(i=0;i<x.length;i++)
		{
				
			x[i]=Integer.parseInt(System.console().readLine());
		}


		System.out.println("what value you want to search with:");

		search=Integer.parseInt(System.console().readLine());

		for(i=0;i<x.length;i++)
		{
				
			if(x[i]==search)
			{
				System.out.println(x[i]);
				break;
			}
		}
		if(i==x.length)
		{
			System.out.println("Value not found");

		}

	}
}