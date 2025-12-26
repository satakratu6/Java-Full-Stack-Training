// Create a parameterized method that accepts account balance and withdraw amount and decides whether the transcation can proceed. 
// the method should return a meaningful message instead of printing directly
import java.util.*;
public class BankTransaction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the balance now: ");
        int currBalance=sc.nextInt();
        System.out.println("Enter the amount to withdraw: ");
        int amount=sc.nextInt();
        bank(currBalance, amount);
        sc.close();
    }
    public static void bank(int currBalance, int amount){
        if(currBalance>=amount){
            currBalance-=amount;
            System.out.println(amount+" succesfully withdrawed ");
            System.out.println("Current Balance: "+currBalance);
        } else{
            System.out.println("Balance is low. Kindly withdraw money lower than the current balance");
        }
    }
}
