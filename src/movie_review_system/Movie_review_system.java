
package movie_review_system;
import java.util.*;
import test.*;


public class Movie_review_system {

    
    public static void main(String[] args) {
        System.out.println("*******************WELCOME TO MOVIE REVIEW SYSTEM**************");
 System.out.println();
 boolean flag=true;
 do{
 System.out.println("PRESS 1 TO GET MOVIE REVIEWS");
 System.out.println("PRESS 2 TO ENTER YOUR REVIEW");
 System.out.println("PRESS 3 TO GET LIST OF TOP MOVIES BY ENTERING GENRE");
 System.out.println("PRESS 0 TO EXIT");
 int x;
 Scanner s= new Scanner(System.in);
 System.out.println("ENTER YOUR CHOICE:");
 x=s.nextInt();
 switch(x){
 case 1:
 movie movie1=new movie();
 movie1.getReview();
 flag=true;
 break;
 case 2:
 user user2=new user();
 movie mov2= new movie();
 boolean newuser1=user2.userlogin();
 if(newuser1)
 {
 mov2.insertReview();
 }

 flag=true;
 break;
 case 3:
 movie movie3= new movie();
 movie3.movieByGenre();
 flag=true;
 break;
 case 0:
 System.out.println("THANK YOU FOR USING US, PLEASE VISIT AGAIN!");
 flag=false;
 break;
 default:
 System.out.println("INVALID CHOICE, ENTER THE CORRECT CHOICE");
 flag=true;
 break;
 }
 }while(flag);
 }
}
        
    
    

