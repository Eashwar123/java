class Queue
{
	private int i;
	private Object o[];
	public Queue()
	{
		o=new Object[10];
			
	}
	public void enqueue(Object h)
	{
		o[i]=h;
		i++;
	}
	public Object dequeue()
	{
		for(i=0;i<o.length;i++)
		{
			return(o[i]);		
		}
		return(null);
	}
	public boolean isEmpty()
	{
		if(i==0)
		{	
			return(true);
		}
		return(false);
	}	
	/*public boolean hasNext()
	{

		if(o[i]!=null)
		{
			return(true);
		}
		return(false);
	}
	*/
}
class program
{
	public static void main(String args[])
	{
		Object t=new Object();
		Queue q=new Queue();
		q.enqueue(5000);
		q.enqueue(39475.442);
		q.enqueue("areysuresh");
		for(int z=0;z<3;z++)
		{
		System.out.println(q.dequeue());
		}
		
	}

}