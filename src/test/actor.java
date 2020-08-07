
package test;
import java.util.*;
import java.sql.*;

public class actor extends user {
    String actorname;
 public void movieByActor(){
 try{
 Scanner s= new Scanner(System.in);
 System.out.println("ENTER THE ACTOR NAME");
 String movieact=s.nextLine();
 Class.forName("com.mysql.jdbc.Driver");
 Connection con=
DriverManager.getConnection("jdbc:mysql://localhost:3306/new1","root","");
 Statement stmt=con.createStatement();
 ResultSet rs= stmt.executeQuery("select * from movie where actor='"+movieact+"'");
 while(rs.next())
 {
 System.out.println("MOVIE NAME:"+rs.getString(1));
 System.out.println("MOVIE GENRE :"+rs.getString(2));
 System.out.println("MOVIE RATING:"+rs.getInt(3));
 System.out.println("ACTOR NAME:"+rs.getString(5));
 System.out.println();
 }
 }
 catch(Exception e)
 {
 System.out.println(e);
 }
 }
    
}
