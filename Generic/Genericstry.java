class Genericlol<T>
{
	public T useme;
	private T bye,i;
	
	public void add(T val)
	{	
		useme=val;
		bye++;
		
	}	
	public T get()
	{	
		return(useme);
	}
	
}

class program
{
	public static void main(String args[])
	{	
		Genericlol<Integer> gi=new <Integer>Genericlol();
		gi.add(100);
		gi.add(200);
		while(!isEmpty())
		{
			System.out.println(gi.get());
		}		
	}
}