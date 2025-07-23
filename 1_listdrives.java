import  java.io.*;

class listdrives{
public static void main(String args[]){

File drives[];
drives=File.listroots();
for(File i=0;i<drives.length;i++)
{
System.out.println(i.getPath());

}
}

}
