import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int balance=0;
        System.out.println("Write your account number: ");
        
        int accountNumber=sc.nextInt();
        if(accountNumber>=1 && accountNumber<=30){
        do {
            System.out.println(
                "Enter your choice:\n" +
                "1 - Withdraw\n" +
                "2 - Deposit\n" +
                "3 - Balance Enquiry\n" +
                "4 - Exit"
            );

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int amount=sc.nextInt();
                    if(amount<=balance) {
                        balance-=amount;
                    System.out.println("Withdrawing money: "+amount);}
                     else{
                        System.out.println("Amount should be greater than balance");
                    }
                    break;
                case 2:
                    int money=sc.nextInt();
                    balance+=money;
                    System.out.println("Depositing money: "+money);
                    break;
                case 3:
                    System.out.println("Balance: "+balance);
                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Wrong choice!!!");
            }

        } while (choice != 4);
    } else{
        System.out.println("Account number is not valid");
    }
        sc.close();
    }
}
