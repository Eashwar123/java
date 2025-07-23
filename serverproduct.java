import java.net.*;
import java.io.*;

class Server
{
	public static void main(String args[])throws Exception
	{
		ServerSocket serversocket=new ServerSocket(3050);

		System.out.println("Server connected, waiting for client");

		Socket clientsocket=serversocket.accept();

		System.out.println("client connected");

		//Listens for a connection to be made to this socket and accepts it. 
		//server recieves a request from the client, and acccepts it. It creates an object in the port.
		//client has a unique ip adress and portid, with which it sends the request.


		InputStream in=clientsocket.getInputStream();

		while(true)
		{
			if(in.available()>0)
			{
				FileInputStream fileIn = new FileInputStream("product.ser");
				ObjectInputStream in = new ObjectInputStream(fileIn);
				in.readObject(product);
				byte[] data=new byte[in.available()];
				in.read(data,0,data.length);
				Object str=new Object(data,0,data.length);
				if(str.equals("exit"))
				{
					break;
				}
	
				System.out.println(str);
			in.close();
			fileIn.close();
			}
		}
	}
}