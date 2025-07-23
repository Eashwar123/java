import java.io.*;

class filewriterreader 
{
	public static void main(String args[])throws IOException
	{
	int i;
	File file=new File("c:\\takasugi.txt");
	FileWriter fw=new FileWriter("takasugi.txt");
	fw.write(65);
	fw.write(97);
	fw.write(69);
	fw.write(99);
	char[] ch=new char[]{'b','y','e','l','o','l'};
	fw.write(ch,0,ch.length);
	
	fw.write("\ngintoki clear",0,13);
	fw.write("\nmorgana better");

	fw.close();
	
	}
}