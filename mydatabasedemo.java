
import java.sql.*;
class mydatabasedemo
{//class start
  
  public static void main(String arg[])throws Exception
  {//main start
    
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//forName is used to register the driver 
    Connection c=DriverManager.getConnection("jdbc:odbc:mydb1");//used to establish connection with database
    Statement st=c.createStatement();//we create statement object to excute querry
    ResultSet rs=st.executeQuery("SELECT * FROM [Sheet2]");

   while(rs.next())
   {
	   //while start
    System.out.println(rs.getString(1));
	
   }//while end
   
 }//main end
 
 
}//class End