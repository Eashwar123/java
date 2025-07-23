import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


class CallableStatementsDemo
{
	public static void main(String args[])throws Exception
	{
		
		try{
			  Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost\\sqlexpress;databaseName=studentDB;integratedSecurity=true;encrypt=true;trustServerCertificate=true");
			Statement st=con.createStatement();
			

			//Creates a Statement object for sending SQL statements to the database.

			st.execute("insert into student(sno,sname,fee) values(?,?,?)");
	
			


			
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