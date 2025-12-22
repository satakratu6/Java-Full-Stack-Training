import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the attempts of login and if the user is already locked or not");
        int loginAttempt=sc.nextInt();
        boolean locked=sc.nextBoolean();
        String res=(loginAttempt>=3 && !locked) ? "Alert": "Alredy Locked";
        System.out.println(res);
        sc.close();
    }
}
