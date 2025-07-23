class arr_program1{
	public static void main(String a[])
		{
			int i,n;
			int x[];
			System.out.println("enter no of blocks of array you want to create:");
			n=Integer.parseInt(System.console().readLine());
			x=new int[n];
			for(i=0;i<x.length;i++)
			{
				x[i]=Integer.parseInt(System.console().readLine());
			}
			for(i=0;i<x.length;i++)
			{
			System.out.println(x[i]);
			}
		}
          }