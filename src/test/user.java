
package test;
import java.util.*;
import java.sql.*;
public class user extends movie {
    String name,passcode;

 public boolean userlogin(){
 boolean val1=false;
 Scanner s= new Scanner(System.in);

 System.out.println("ENTER YOUR NAME AND YOUR PASSCODE");
 name=s.nextLine();
 passcode=s.nextLine();
 if(name.equals("admin")&& passcode.equals("admin123")){
 val1=true;
 }
else{
 System.out.println("WRONG CREDENTIALS");
val1=false;
}
return val1;}
    
}
