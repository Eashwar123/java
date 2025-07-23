import java.io.*;


class program
{
	public static void main(String[] args) throws Exception

	{

                Employee e= new Employee();

		e.eid=100;
		e.ename="hello";
		
		 FileOutputStream fileOut = new FileOutputStream("Employee.ser");
		 ObjectOutputStream out=new ObjectOutputStream(fileOut);

		out.writeObject(e);
		
		out.close();

	
		System.out.printf("Serialized data is saved in /tmp/employee.ser");
	}
		

	}

	class Employee implements Serializable
	{
		private static final long serialVersionUID = 1L;
		public int eid;
		public String ename;
		public double price;

		public void read(){

			eid=Integer.parseInt(System.console().readLine());
			ename=System.console().readLine();
			price=Double.parseDouble(System.console().readLine());
			
				}
			public void print(){
				System.out.println(eid+ename+price);
			}

		}

