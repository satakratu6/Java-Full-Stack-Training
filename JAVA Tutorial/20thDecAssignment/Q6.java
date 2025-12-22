import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write age and if the user is banned or not");
        int age=sc.nextInt();
        boolean banned=sc.nextBoolean();
        String res=(age>=18 && !banned)?"Can Access":"Can't Access";
        System.out.println(res);
        sc.close();
    }
}
