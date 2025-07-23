class Counter
{
		public Counter count;
		pblic boolean isValueset;
	public Counter()
		{
			count=0;
			isValueSet=false;
		}
	public void set(int value)
		{
			count=value;	
		}
	public int get()
		{
			return count;
		}
	
}





class Producer extends Thread
{
	public Counter count;

	public int i;

	//producer constructer

	public Producer(Counter count)
	{
		this.count=count;
		/*this.count indicates that the variable taken in by constructer is equal to the variable count initialized as the object of method Counter*/ 
		
		i=0;
	}
			
	public run()
	{
		while(i<10)
		{
			if(!count.isValueSet)
			{
				count.set(i);
				count.isValueSet=true;
				notify();		
			//notify indicates the waiting thread to continue and run
			}
			else{
				System.out.println("Producer is waiting");
				wait();
	    //wait indicates the current thread that is producer to wait until notify is again triggered	
			}
			i++;
		}
	}

 }
class Consumer extends Thread
{
	public Counter count;

	public int i;
	
	public Consumer(Counter count)
	{
		this.count=count;
	/*this.count indicates that the variable taken in by constructer is equal to the variable count initialized as the object of method Counter*/ 
	}
	public run()
	{
		while(i<10)
		{
			if(count.isValueSet)
			{
				count.set(i);
	`			notify();
			}
			else{

			System.out.println("Consumer is waiting");
			wait();
			}
		}
	}
}

class program
{
	public static void main(String args[])
		{