import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter whether the customer has premimum value and cart value: ");
        boolean premiumMember=sc.nextBoolean();
        int cartValue=sc.nextInt();
        String res=(premiumMember || cartValue>5000)?"Gets Discount":"No Discount";
        System.out.println(res);
    }
}
