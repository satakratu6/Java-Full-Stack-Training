
public class Q7 {
    public static void main(String[] args) {
        boolean paymentStatus=true;
        boolean stockAvailable=true;
        boolean backOrderAllowed=true;
        String res=(paymentStatus && (stockAvailable || backOrderAllowed)?" Order Confirmed":"Order Not Confirmed");
        System.out.println(res);
    }
}
