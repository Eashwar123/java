import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


class SqlConnection
{
	public static void main(String args[])throws Exception
	{
		int sno;
		String sname;
		Double fee;
		sno=Integer.parseInt(System.console().readLine());
		sname=System.console().readLine();
		fee=Double.parseDouble(System.console().readLine());
		try{
			  Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost\\sqlexpress;databaseName=studentDB;integratedSecurity=true;encrypt=true;trustServerCertificate=true");
			Statement st=con.createStatement();

			//Creates a Statement object for sending SQL statements to the database.

			PreparedStatement pst=con.prepareStatement("update student set fee=? where id=?");
			pst.setInt(1,1001);
			pst.setString(2,"michel bollinger");
			pst.setDouble(3,56893.00);
		
			//st.execute("insert into student(sno,sname,fee) values(?,?,?)");
	
			/*
			pst.setString(2,"tohru");
			pst.setDouble(3,56893.00);
			*/
			


			
			ResultSet res=st.executeQuery("select * from student");
			while(res.next())
			{
				System.out.println(res.getInt(1)+","+res.getString(2)+","+res.getDouble(3));
			}
		}catch(Exception ex)
			{
				ex.printStackTrace();
			}

	}
}