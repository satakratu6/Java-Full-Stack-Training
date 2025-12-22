import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Is the seat available?");
        boolean SeatAvailable=sc.nextBoolean();
        System.out.println("Is the member ship valid?");
        boolean ValidMembership=sc.nextBoolean();
        System.out.println("Is the promo code valid?");
        boolean ValidPromoCode=sc.nextBoolean();
        String res=(SeatAvailable && (ValidMembership || ValidPromoCode))?"Allowed to Book Tickets":"Not Allowed to Book Tickets";
        System.out.println(res);
        sc.close();
    }
}
