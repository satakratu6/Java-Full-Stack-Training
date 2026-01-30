package TopBrainsCollections;

import java.util.LinkedHashMap;

public class BankAccountManagementSystem {
	public static void main(String[] args) {
		BankAccountManager b=new BankAccountManager();
		b.addAccount(new BankAccount(1001, "Rahul", 5000.0));
		b.addAccount(new BankAccount(1002, "Anjali", 8000.0));
		b.addAccount(new BankAccount(1003, "Vikram", 3000.0));
		b.addAccount(new BankAccount(1002, "Anjali", 8000.0));
		b.getAccount(1002);
		b.displayAll();

	}
}
class BankAccount{
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	public BankAccount(int accountNumber, String accountHolderName, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void updateBalance(double amount) {
		accountBalance=amount;
	}
	public void displayAccount() {
		System.out.println("Account No:"+accountNumber+", Name: "+accountHolderName+", Balance: "+accountBalance);
	}
}
class BankAccountManager{
	LinkedHashMap<Integer, BankAccount> accounts=new LinkedHashMap<Integer, BankAccount>();
	public void addAccount(BankAccount b) {
		if (accounts.containsKey(b.getAccountNumber())) {
            System.out.println("Duplicate account number not allowed: " + b.getAccountNumber());
        } else {
            accounts.put(b.getAccountNumber(), b);
            System.out.println("Account added -> Account No: "+b.getAccountNumber()+", Name: "+b.getAccountHolderName()+", Balance: "+b.getAccountBalance());
        }
	}
	public void getAccount(int accountNumber) {
		if(accounts.containsKey(accountNumber)) {
			BankAccount b=accounts.get(accountNumber);
			System.out.println("Account found -> Account No: "+accountNumber+", Name: "+b.getAccountHolderName()+", Balance: "+b.getAccountBalance());
		} else {
			System.out.println("Account Not Found");
		}
	}
	public void displayAll() {
		System.out.println("All Bank Accounts (Insertion Order Preserved):");
		for(BankAccount b: accounts.values()) {
			b.displayAccount();
		}
	}
	
}
