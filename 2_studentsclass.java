class student{
private int sno;
private String sname;
private double fee;
public void read(){
sno=Integer.parseInt(System.console().readLine());
sname=System.console().readLine();
fee=Double.parseDouble(System.console().readLine());
}
public void print(){
System.out.println(sno+sname+fee);
}
