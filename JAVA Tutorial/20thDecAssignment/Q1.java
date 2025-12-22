import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Useername and Password");
        String username=sc.nextLine();
        String password=sc.nextLine();
        System.out.println("Enter Account Status");
        boolean status=sc.nextBoolean();
        boolean login=(!username.equals(null) && !password.equals(null) && status!=false);
        String res=login==true?"Logged in":"Can't log in";
        System.out.println(res);
        sc.close();
    }
}
