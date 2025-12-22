import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the paymentStatus, stockvailable and backorder allowed: ");
        boolean paymentStatus=sc.nextBoolean();
        boolean stockAvailable=sc.nextBoolean();
        boolean backOrderAllowed=sc.nextBoolean();
        String res=(paymentStatus && (stockAvailable || backOrderAllowed)?" Order Confirmed":"Order Not Confirmed");
        System.out.println(res);
        sc.close();
    }
}
