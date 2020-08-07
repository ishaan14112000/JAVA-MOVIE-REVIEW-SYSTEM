
package test;

import java.sql.*;
import java.util.*;
public class movie {
    String name;
 String genre;
 String usercomment;
 int rating;
 int collection;
 public void getReview() {
 try{
 Scanner s= new Scanner(System.in);
 System.out.println("ENTER MOVIE NAME");
 String moviename=s.nextLine();
 Class.forName("com.mysql.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new1","root","");
 Statement stmt=con.createStatement();
 ResultSet rs=stmt.executeQuery("select * from movie where name='"+moviename+"' ");
 while(rs.next())
 {
 System.out.println("MOVIE NAME:"+rs.getString(1));
 System.out.println("MOVIE GENRE :"+rs.getString(2));
 System.out.println("MOVIE RATING:"+rs.getInt(3));
 System.out.print("MOVIE EARNING(IN CRORES):"+rs.getInt(4));
 System.out.println();
 }
 }
 catch(Exception e)
 {
 System.out.println(e);
 }
 }
 public void insertReview(){
 try{
 String name,genre,usercomment;
 int rating,collection;
 Scanner s=new Scanner(System.in);
 System.out.println("ENTER THE MOVIE NAME, THEN GENRE, THEN RATING,THEN COLLECTION AND THEN COMMENTS");
 name=s.nextLine();
 genre=s.nextLine();
 rating=s.nextInt();
 collection=s.nextInt();
 usercomment=s.nextLine();
 Class.forName("com.mysql.jdbc.Driver");
 Connection con=
DriverManager.getConnection("jdbc:mysql://localhost:3306/new1","root","");
 Statement stmt=con.createStatement();
 stmt.executeUpdate("insert into movie(name,genre,rating,collection,comments)values('"+name+"','"+genre+"','"
+rating+"','"+collection+"','"+usercomment+"')");
 System.out.println("RECORDS INSERTED SUCCESSFULLY");
 }
 catch(Exception e){System.out.println(e);}
 }
public void movieByGenre(){
 try{
 Scanner s= new Scanner(System.in);
 System.out.println("ENTER THE GENRE");
 String moviegenre=s.nextLine();
 Class.forName("com.mysql.jdbc.Driver");
 Connection con=
DriverManager.getConnection("jdbc:mysql://localhost:3306/new1","root","");
 Statement stmt=con.createStatement();
 ResultSet rs= stmt.executeQuery("select * from movie where genre='"+moviegenre+"' order by rating DESC");
 while(rs.next())
 {
 System.out.println("MOVIE NAME:"+rs.getString(1));
 System.out.println("MOVIE GENRE :"+rs.getString(2));
 System.out.println("MOVIE RATING:"+rs.getInt(3));
 System.out.println();
 }
 }
 catch (Exception e){
 System.out.println(e);
 }
 }
}
