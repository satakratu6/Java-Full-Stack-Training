package topbrainsthreads;

public class PaymentGatewayBatchTransactionProcessing {

	public static void main(String[] args) {
		Account ac=new Account(10000);
		TransactionTask t1=new TransactionTask(ac, 3000, "TXN001");
		TransactionTask t2=new TransactionTask(ac, 4000, "TXN002 ");
		TransactionTask t3=new TransactionTask(ac,3500, "TXN003");
		Thread th1=new Thread(t1);
		Thread th2=new Thread(t2);
		Thread th3=new Thread(t3);
		th1.start();
		th2.start();
		th3.start();
	}

}

class Account {
	int balance;
	Account(int balance){
		this.balance=balance;
	}
	synchronized void debit(int amount) {
		if(balance>=amount) {
			System.out.println(Thread.currentThread().getName()+" debiting amount: "+amount);
			balance-=amount;
			System.out.println("Remaining balance: "+balance);
			
		} else {
			System.out.println("transaction failed due to insufficient balance");
		}
	}
	public int getBalance() {
		
		return balance;
	}
	
}
class TransactionTask implements Runnable{
	Account ac;
	int amount;
	String transactionId;
	public TransactionTask(Account ac, int amount, String transactionId) {
		super();
		this.ac = ac;
		this.amount = amount;
		this.transactionId = transactionId;
	}
	@Override
	public void run() {
		System.out.println("Processing transaction: "+transactionId);
        ac.debit(amount);

	}
}