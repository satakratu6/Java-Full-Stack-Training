
public class Q4 {
    public static void main(String[] args) {
        boolean PremiumMember=false;
        int cartValue=800;
        String res=(PremiumMember || cartValue>5000)?"Gets Discount":"No Discount";
        System.out.println(res);
    }
}
