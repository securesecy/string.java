import java.util.*;
public class Strings{

     public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        
        String FirstName = sc.next();
        String LastName = sc.next();
        String FullName = FirstName + " " + LastName;
        System.out.println(FullName);
     }
}
