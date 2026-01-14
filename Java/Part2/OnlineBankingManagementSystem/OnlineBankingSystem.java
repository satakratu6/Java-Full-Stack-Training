package OnlineBankingManagementSystem;
import java.util.Scanner;
public class OnlineBankingSystem {
private Account[] accounts = new Account[] {
    new Account(101, "Satakratu", 5000),
    new Account(102, "Rahul", 5000)
};    
    private int count=0;
    private Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        try{
            new OnlineBankingSystem().transferFunds();
            System.out.println("Transaction Succesfull");
        } catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
         catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        } 
        catch(AccountNotFoundException a){
            System.out.println(a.getMessage());
        } finally {
        	System.out.println("Transaction ended.");
        }
    }
public void transferFunds() throws AccountNotFoundException, IllegalArgumentException, InsufficientFundsException{
    Account sourceAccount=null;
    Account targetAccount=null;
    System.out.println("Enter source account number: ");
    int source=sc.nextInt();
    System.out.println("Enter target account number: ");
    int target=sc.nextInt();
    System.out.println("Enter amount to transfer: ");
    int amount=sc.nextInt();
     if(amount>0){
    for(int i=0;i<accounts.length;i++){
       if (accounts[i].getAccountNumber() == source) {
        sourceAccount = accounts[i];
        }
        if (accounts[i].getAccountNumber() == target) {
        targetAccount = accounts[i];
        }
       
    }
     if(sourceAccount==null ){
            throw new AccountNotFoundException("Transaction failed: Source account "+source+" doesn't exist");
        } 
        if(targetAccount==null){
            throw new AccountNotFoundException("Transaction failed: Target account "+source+" doesn't exist");
        }
       
        Account acc = accounts[0];
        Account ta=accounts[1];

        if (amount <= acc.getBalance()) {
            acc.withdraw(amount);
            ta.deposit(amount);

        }
         else{
            throw new InsufficientFundsException("Transaction failed: Insufficient funds in account "+accounts[0].getAccountNumber());
        }
} else{
        throw new IllegalArgumentException("Transaction failed: Amount cannot be negative or zero");
    }
}
}
