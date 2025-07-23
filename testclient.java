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


class testclient
{
	public static void main(String args[])throws Exception
	{
		Product p;
		p=new Product();

		Socket sc=new Socket("192.168.0.151",3050);
		System.out.println("connected to server");
		p.read();
		
	}
}