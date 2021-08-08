import java.sql.DriverManager;
import java.sql.Connection;

class DemoDemo
{
   public static void main(String args[]) throws Exception
   {
      Class.forName("com.mysql.cj.jdbc.Driver");
	  //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	  Connection con= null;
	  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","root");
	 
	  System.out.println(con.getClass());
	  
	  if(con == null)
	  {
	      System.out.println("Connection not etstablish");
		  
	  }
	  else
	  {
	      System.out.println("Connection not etstablish");
	  }
      
   }
}