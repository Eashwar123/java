class prg3{
	public static void main(String a[])
		{
			int i,j;
                        int x[][];
                        x=new int[5][3];
			for(i=0;i<x.length;i++)
			{
				for(j=0;j<x[i].length;j++)
				{
					x[i][j]=Integer.parseInt(System.console().readLine());
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