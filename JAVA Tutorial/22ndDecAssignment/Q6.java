import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the cart value: ");
        int cartValue=sc.nextInt();
        System.out.println("Is address valid or not");
        boolean isValid=sc.nextBoolean();
        if(cartValue!=0 && isValid){
            System.out.println("Checkout is allowed");
        } else{
            System.out.println("Checkout is not allowed");
        }
        sc.close();
    }
}
