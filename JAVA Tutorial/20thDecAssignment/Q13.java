import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Is the user logged in");
        boolean isLoggedIn=sc.nextBoolean();
        System.out.println("Has the user accepted terms and conditions");
        boolean isAcceptedTAC=sc.nextBoolean();
        String res=isLoggedIn&&isAcceptedTAC?"Feature is Enabled":"Feature can't be enabled";
        System.out.println(res);
        sc.close();
    }
}
