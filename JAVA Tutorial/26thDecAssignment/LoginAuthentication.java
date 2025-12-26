//Design a method that accepts username, and password as parameters and validates them against predefined credentials.
//The method should return a status code(not boolean)
import java.util.*;
public class LoginAuthentication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userName=sc.nextLine();
        System.out.println("Enter your password: ");
        String password=sc.nextLine();
        authentication(userName, password);
        sc.close();
        
    }
    public static void authentication(String userName, String password){
        String user="Satakratu";
        String pass="satakratu567@";
        if(userName.equals(user) && password.equals(pass)){
            System.out.println("200 OK");
        } else{
            System.out.println("401 Unauthorized");
        }
    }
}
