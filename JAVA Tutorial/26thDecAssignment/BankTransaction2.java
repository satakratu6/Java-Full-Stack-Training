import java.util.*;
public class BankTransaction2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your account number: ");
        int accountNumber=sc.nextInt();
        int choice=1;
        System.out.println("Enter your balance: ");
        int balance=sc.nextInt();
        while(choice!=4){
            System.out.println("Enter your choices:\n1 - deposit\n2 - withdraw\n3 - details\n4 - exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    int amount=sc.nextInt();
                    if(deposit(balance, amount)){
                        System.out.println(amount+" Succesfully deposited");
                        balance=balance+amount;
                    } else{
                        System.out.println("Enter positive amount  to deposit");
                    }
                    
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    int withdrawAmount=sc.nextInt();
                    if(withdraw(balance, withdrawAmount)){
                        System.out.println(withdrawAmount+" is withdrawed succesfully");
                        balance=balance-withdrawAmount;
                    } else{
                        System.out.println("Insufficient balance: ");
                    }
                case 3:
                    System.out.println("Current Balance of "+accountNumber+" is: "+balance);
                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Wrong choice!!!");
            }
        }

    }
    public static boolean deposit(int balance, int amount){
        return amount>0;
    }
    public static boolean withdraw(int balance, int amount){
        return amount>0 && amount<balance;
    }
    public static int details(int balance){
        return balance;
    }
}
