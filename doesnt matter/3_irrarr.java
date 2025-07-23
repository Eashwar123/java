//to create 50 rows of irregular array then create 1 block for the first row, 2 blocks for the second row, and so on and name them 1,2,...

	class prg7{
		public static void main(String a[])
			{
				int x[][];
				int i,j,n;
				x=new int[50][];
				//creating columns
				for(i=0;i<x.length;i++)
					{
					x[i]=new int[i+1];
					}
				for(i=0;i<x.length;i++)
					{
					for(j=0;j<x[i].length;j++)
						{
						
							x[i][j]=j+1;
						}
					}
				for(i=0;i<x.length;i++)
					{
					for(j=0;j<x[i].length;j++)
					   {

						System.out.println(x[i][j]);
					}
				}

			}
		}