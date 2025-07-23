import java.io.*;

class FileOutputStreams{
	public static void main(String args[])throws IOException
	{


		FileOutputStream file=new FileOutputStream("test.txt");
		FileOutputStream filehelp=new FileOutputStream("help.txt");
		file.write(66);
		file.write(78);
		byte[] use=new byte[]{69,72,77,99};
		file.write(use,0,use.length);

		/*write(byte[] b, int off, int len) is the syntax in oracle. First we're giving byte[] array object, off to know where we're starting at, 
		length of the byte array object.*/

		file.write((int)'H');

		//what this does is it converts the character in its ascii equivalent byte for the compiler

		//here we have described 3 write methods to write from the program to file, thats called as the OutputStream

		String str=new String("welcome to output streams");

		file.write(str.getBytes());

		file.close();

		//make sure to close so compiler knows that we're writing and it should be added.
		
		//inputstream

		FileInputStream fin=new FileInputStream("test.txt");

		//we're initializing an integer to start from 0
		
		byte[] data= new byte[fin.available()];

		// data is the array we're taking to read x no of bits each

		int count=data.length;

		fin.read(data,0,fin.available());

		System.out.println("the length is:"+data.length);

		for(int i=count-1;i>=0;i--)
			{
				filehelp.write(data[i]);
				System.out.print((char)data[i]);

			}

		fin.close();
	}
}
