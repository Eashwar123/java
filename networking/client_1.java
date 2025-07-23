import java.net.*;
import java.io.*;
import java.util.*;
class Client{
    public static void main(String a[])throws Exception{
        String str;
        Scanner s= new Scanner(System.in);
        Socket serversocket=new Socket("192.168.0.4",3050);
        OutputStream out=serversocket.getOutputStream();
        InputStream in =serversocket.getInputStream();
        while(true){
            System.out.println("Enter message");
            str=s.next();
            byte[] data=str.getBytes();
            out.write(data,0,data.length);
            if(str.equals("exit")){
                break;
            }
            while(true){
                if(in.available()>0){
                    byte[] data1=new byte[in.available()];
                    in.read(data1,0,data1.length);
                    String reply=new String(data1,0,data1.length);
                    System.out.println(reply);
                    break;
                }
            }
        }
    }
}