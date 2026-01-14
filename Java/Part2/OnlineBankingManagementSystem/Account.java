package OnlineBankingManagementSystem;

class AccountNotFoundException extends Exception{
    AccountNotFoundException(String m){
        super(m);
    }
}
class InsufficientFundsException extends Exception{
    InsufficientFundsException(String m){
        super(m);
    }
}

class IllegalArgumentException extends Exception{
   IllegalArgumentException(String m){
        super(m);
    }
}
public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    Account(int accountNumber, String accountHolderName, double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Updated balance of "+accountNumber+" :"+(int)balance);
    }
    public void withdraw(double amount){
        balance-=amount;
        System.out.println("Updated balance of "+accountNumber+" :"+(int)balance);

    }
    public String toString(){
        return "Account Holder Name "+accountHolderName;
    }
}
