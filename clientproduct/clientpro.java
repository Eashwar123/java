import java.net.*;
import java.io.*;

class Product  implements Serializable
{
	
 	private int pid;
	private String pname;
	private double price;
	public void read()
	{
       		System.out.print("enter id:");
		pid=Integer.parseInt(System.console().readLine());
		System.out.print("enter name:");
		pname=(System.console().readLine());
		System.out.print("enter price");
		price=Double.parseDouble(System.console().readLine());
        }

    	public void print() 
	{
        	System.out.println(pid+" "+pname+" "+price);
   	}	
}
class clientproduct
{
	public static void main(String[] args)throws Exception
	{
        	Product p=new Product();
		Socket serversocket=new Socket("192.168.0.104",3050);
		OutputStream out=serversocket.getOutputStream();
		
		while(true)
		{
			p.read();
			ObjectOutputStream oos=new ObjectOutputStream(out);
			oos.writeObject(p);
		
			if(System.console().readLine().equals("exit")) break;
			
		}	

   	}
}