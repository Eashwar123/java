class student{
	private int Sno;
	private String Sname;
	private double fee;
		public void read(){
                        System.out.println("Write the Sno:");
			Sno=Integer.parseInt(System.console().readLine());
 			System.out.println("Write the Sname:");
			Sname=System.console().readLine();
			System.out.println("Write the fee:");
			fee=Double.parseDouble(System.console().readLine());
				}

		public void print(){
			System.console().printf("%d %s %f",Sno,Sname,fee);
				}
		}
//now to access this class, we need to think like how we used to call those functions
class prg9{
	public static void main(String a[])
		{
			student s;
			s=new student();
			s.read();
//class gives address of the interface, and interface is the memory thats allocated in the system for class
//reads values of Sno,Sname,fee because theyre now internally created in the new student interface
			s.print();
		}
	}
