//we need to create 50 blocks. 1st block should create 1 , 2nd block should create 2 etc.

class program
{
	public static void main(String args[])
	{
		int x[][];
		x=new int[50][];
		for(int i=0;i<x.length;i++)
		{
			x[i]=new int[i+1];

		}
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				x[i][j]=j+1;

			}
	
		}
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.println(x[i][j]);

			}
	
		}



	}

}