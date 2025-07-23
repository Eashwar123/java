class prg4{
		public static void main(String a[])
			{
				int i,j;
				int x[][];
				x=new int[5][];
				x[0]=new int[3];
				x[1]=new int[5];
				x[2]=new int[3];
				x[3]=new int[6];
				x[4]=new int[2];
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
