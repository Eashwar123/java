import java.net.*;
import java.io.*;

class Server
{
	public static void main(String args[])throws Exception
	{
		ServerSocket serversocket=new ServerSocket(3040);

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
				byte[] data=new byte[in.available()];
				in.read(data,0,data.length);
				String str=new String(data,0,data.length);
				if(str.equals("exit"))
				{
					break;
				}

				System.out.println(str);
			}
		}
	}
}