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
		System.out.printf("%d\n %s %f",sno,sname,fee);
	}
}


class program
{
	public static void main(String args[])
	{
		int i;
		Student s[];
		s=new Student[5];
		for(i=0;i<s.length;i++)
		{
			s[i]=new Student();
		}
		for(i=0;i<5;i++)
		{
			s[i].read();
		
		}
		for(i=0;i<5;i++)
		{
			s[i].print();
		
		}
	}


}