//Selection sort
#include<stdio.h>
#include<conio.h>

int main()
{
 x[8]={23,54,67,98,34,66,12,66};
int i,p;
selection_sort(x[],8);
for(i=0;i<9;i++)
{
	printf("%d",x[i]);
}


return 0;
}
void selection_sort(Array a[],int n)
	{
		int minindex,j,k,use;
		for(j=0;j<n-1;j++)
		{
			minindex=j;
			use=0;	
			for(k=j+1;k<n;k++)
			{
				if(a[minindex]>a[k])
				{
					minindex=k;
					use=1;

				}	
			}
			if(use)
			{
				int temp;
				temp=a[j];
				a[j]=a[minindex];
				a[minindex]=temp;
				
			}
		}
		


	}