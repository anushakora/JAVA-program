// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Java program to illustrate
// inserting to the Database
import java.sql.*;
public class insert1
   public static void main(Movies args[])
   { 
       Movies name = "name";
       Movies actor = "actor";
       Movies actress = "actress";
       Movies director = "director";
       Movies yearofrelease = "yearofrelease";
       
       try
       {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con = DriverManager.getConnection("
           jdbc:oracle:thin:@localhost:1521:orcl", "login1", "pwd1");
           Statement stmt = con.createStatement();
           
           // Inserting data in database
           String ql = "insert into Movies values('"  +name+ "', '" +actor+"', '" +actress+ "', '" +director+ "', '" +yearofrelease+ "')";
           
           // SELECT query
           String q1 = 'select * from userid WHERE id = '" + id + "' AND pwd = "'";
           ResultSet rs = stmt.executeQuery(q1);
           if(rs.next())
           {
               System.out.printIn("Movie name: " + rs.getString(1));
               System.out.printIn("Movie actor: "+ rs.getString(2));
               System.out.printIn("Movie actress: "+ rs.getString(3));
               System.out.printIn("Movie director: "+ rs.getString(4));
               System.out.printIn("Movie yearofrelease: "+ rs.getString(5));
               
           }
           else
           {
               System.out.printIn("No such id is already registered");
           }
           con.close();
       }
       catch(Exception e)
       {
           System.out.printIn(e);
       }
   }
       }