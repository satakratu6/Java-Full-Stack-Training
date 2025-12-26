//create a method that takes purchase amount and customer type (regular/premium) and returns the final payable amount after displaying discounts
import java.util.*;
public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the purchase amount: ");
        int purchaseAmount=sc.nextInt();
        System.out.println("Write the customer type: ");
        sc.nextLine();
        String customerType=sc.nextLine();
        discount(purchaseAmount, customerType);
    }
    public static void discount(int purchaseAmount, String customerType){
        int finalAmount=0;
        if(customerType.equals("Premium")){
            finalAmount=purchaseAmount-purchaseAmount/10;
            System.out.println("20% discount is applied on the full purchased amount");
            System.out.println("Final Amount after applying discount: "+finalAmount);
        } else if(customerType.equals("Regular")){
            finalAmount=purchaseAmount;
            System.out.println("As regular customer you have to pay the full amount: ");
            System.out.println("Final amount: "+finalAmount);
        } else{
            System.out.println("Invalid customer type");
        }
    }
}
