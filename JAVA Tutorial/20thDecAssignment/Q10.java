
public class Q10 {
    public static void main(String[] args) {
        boolean SeatAvailable=true;
        boolean ValidMembership=true;
        boolean ValidPromoCode=true;
        String res=(SeatAvailable && (ValidMembership || ValidPromoCode))?"Allowed to Book Tickets":"Not Allowed to Book Tickets";
        System.out.println(res);
    }
}
