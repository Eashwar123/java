class product{
	private int pid;
	private String pname;
	private double price;
			public void read(){
				pid=Integer.parseInt(System.console().readLine());
				pname=(System.console().readLine());
				price=Double.parseDouble(System.console().readLine());
				}
			public void print(){
				System.console().printf("%d %s %f\n",pid,pname,price);
					}
			public int equals(Object t){
					if(pid==(int)t)
					{
					return(true);
					}
					return(false);
				}
			public String toString(){
				return (pid+","+pname+""+price);
				}
			}
class employee {
	private int eid;
	private String ename;
	private double salary;
	public void read(){
		eid=Integer.parseInt(System.console().readLine());
		ename=(System.console().readLine());
		salary=Double.parseDouble(System.console().readLine());
	}
	public void print(){
		System.console().printf("%d %s %f\n",eid,ename,salary);
	}
			public int equals(Object t){
					if(eid==(int)t)
					{
					return(true);
					}
					return(false);
				}
public String toString(){
return eid+","+ename+""+salary;
}
	}
class list
{
	private Object b[];
	private int count;
	public list(){
		b=new Object[10];
	         }
	public void add (Object obj)
	{
		b[count]=obj;
		count++;
	}
public Object find(int k)
{
for(int i=0;i<5;i++){
if(b[i].equals(k)){
return(b[i]);
}
}
}


class programnew{
		public static void main(String args[])
			{
			product p=new product();
			employee e=new employee();
			list l=new list();
			p.read();
			e.read();		
			Object o=new Object();
			l.add(p);
			l.add(e);
			l.add(1001);
			l.add("ravi");
			l.add(22.444);
			Object f;
			System.out.println(p);
			System.out.println(e);
                       Object g=l.find(1001);
		}
	}
