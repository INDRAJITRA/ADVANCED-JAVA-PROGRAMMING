import java.sql.*;
class mydatabase1Excecute
{
	public static void main(String arg[])throws Exception
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection c=DriverManager.getConnection("jdbc:odbc:mydb");
	Statement s=c.createStatement();
	ResultSet rs=s.executeQuery("SELECT * FROM stud");
	while(rs.next())
	{
		System.out.print(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}	

	

	}
}