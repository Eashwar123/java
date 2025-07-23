class PrintString
{
	public synchronized void print(String str)
	{
		/*synchronized keyword is used to tell the cpu to only perform one thread at a time. If the current thread is occupying the resources, those resources cannot be used by other threads until this particular thread is free*/
		try{
			System.out.print("[");
			Thread.currentThread().sleep(1);
			System.out.print(str);
			System.out.println("]");
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
			

}

class MyThread implements Runnable
{
	//or could use extends Threads

	private PrintString ps;

		// object of method PrintString, which is used to print
	String str;
		
	public MyThread(PrintString ps,String str)
		{
			this.ps=ps;
			this.str=str;
		/*this.ps says that MyThread parameter printstring ps is equal to the private obj PrintString ps we're initialized near the start*/
		}

	public void run()
		{
			ps.print(str);

			//this str is passed to the PrintString class's method print(String str)

		}
}
class program
{
	public static void main(String args[])
	{
		PrintString ps=new PrintString();
		
		Thread t1=new Thread(new MyThread(ps,"Innovative"));
		Thread t2=new Thread(new MyThread(ps,"Software"));
		Thread t3=new Thread(new MyThread(ps,"Solutions"));

		//we're taking 3 threads here, and passing the same PrintString ps object to all 3 threads
		//we're passing 3 diff strings to 3 threads of the MyThread constructer

		t1.start();

		//start calls the run method

		t2.start();
		t3.start();
	}
}