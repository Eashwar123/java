
class MyThread extends Thread
{
	public void run()
	{
				
		for(int i=5;i>0;i--)
		{
			System.out.println(i);
		}
	}


}
class program
{
	public static void main(String args[])
	{

		MyThread mt=new MyThread();
		mt.start();//start will call run method.

		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}	

		
	}
}