import java.net.*;
class testserver
{
	public static void main(String args[])throws Exception
	{
		ServerSocket sc=new ServerSocket(3050);
		System.out.println("server is waiting for client");
		Socket soc=sc.accept();
		System.out.println("client connected");
	}
}