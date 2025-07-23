/*searching a student with student number, we cant directly access the student number, since its a private member/variable*/

class Student
{
	private int sno;
	private String sname;
	private Double fee;
	public void read()
	{
		sno=Integer.parseInt(System.console().readLine());
		sname=System.console().readLine();
		fee=Double.parseDouble(System.console().readLine());
	}
	public void print()
	{
		System.out.printf("%d\n %s\n %f",sno,sname,fee);
	}
	public int getsno()
	{
		return(sno);
	
	}
}
class program
{
	public static void main(String args[])
	{
		
		int number,i;
		//number used to search for the student using student id
		Student s[];
		s=new Student[5];
		for(int j=0;j<s.length;j++)
		{
			s[j]=new Student();
		}
		for( i=0;i<s.length;i++)
		{
			s[i].read();
		
		}
		System.out.println("the number you want to check with");
		number=Integer.parseInt(System.console().readLine());

		for(i=0;i<s.length;i++)
		{

			if(number==s[i].getsno())
			{
			System.out.println("student found:");	
			System.out.println(s[i].print());
			break;
			}
		}

		if(i==s.length)
		{
			System.out.println("No student found with that id");
		}			
	}
}