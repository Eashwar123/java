import java.net.*;
import java.io.*;

class serverproduct implements Serializable
{
	public static void main(String args[])throws Exception
	{
		ServerSocket serversocket=new ServerSocket(3050);

		System.out.println("server started,waiting for client");
		Socket clientsocket=serversocket.accept();
		System.out.println("client connected");

		InputStream in=clientsocket.getInputStream();
		
		while(true)
		{	
			ObjectInputStream oi = new ObjectInputStream(in);
			Object o =oi.readObject();	
			Product t;
			t = (Product)o;
			t.print();	
		}

	}
}