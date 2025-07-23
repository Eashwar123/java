class program
{
	public static void main(String args[])
	{
		int x[][],y[][];
		int a,b;
		a=Integer.parseInt(System.console().readLine());
		b=Integer.parseInt(System.console().readLine());
		x=new int[a][b];
		y=new int[a][b];
		//read values in the array(matrix)
		System.out.println("values in the x matrix:");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				
				x[i][j]=Integer.parseInt(System.console().readLine());
				
			}

		}
		System.out.println("values in the y matrix:");
		for(int i=0;i<y.length;i++)
		{
			for(int j=0;j<y[i].length;j++)
			{
				y[i][j]=Integer.parseInt(System.console().readLine());
			}

		}	
		for(int i=0;i<y.length;i++)
		{
			for(int j=0;j<y[i].length;j++)
			{
				System.out.println("Addition of the two matrices is:"+x[i][j]+y[i][j]);

			}

		}		
		
		
		

	}

}