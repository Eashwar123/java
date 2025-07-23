import java.net.*;
import java.io.*;

class Product implements Serializable
	{
		private static final long serialVersionUID = 1L;
		public int pid;
		public String pname;
		public double price;

		public void read(){

			pid=Integer.parseInt(System.console().readLine());
			pname=System.console().readLine();
			price=Double.parseDouble(System.console().readLine());
			
				}
			public void print()
			{
				System.out.println(pid+pname+price);
			}

	}



class Clientproduct
{
	public static void main(String args[]) throws Exception
	  {
		Product p;
		p=new Product();
		String str;
		Socket serversocket=new Socket("192.168.0.151",3050);
		p.pid=101;
		p.pname="notebook";
		p.price=22000.0;
		ObjectOutputStream use=new ObjectOutputStream(serversocket.getOutputStream());
		OutputStream out=serversocket.getOutputStream();
		while(true)
			{
				
			System.out.print("Enter message:");

			str=System.console().readLine();

			use.writeObject(p);

			if(str.equals("exit"))
				{
					break;	
				}
	
			}
			use.close();
			
			out.close();
		
		

		 
          }
	
}