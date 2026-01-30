package TopBrainsCollections;

public class BankingTransactionLimitValidator {
	public static void main(String[] args) {
		TransactionValidator transactions[]= {
				new TransactionValidator(new BankAccount(101, 20000, 15000),3000),
				new TransactionValidator(new BankAccount(102, 20000, 18000),3000),
				new TransactionValidator(new BankAccount(103, 20000, 10000),null)
		};
		for(TransactionValidator t: transactions) {
			t.isTransactionAllowed(t.getB(), t.getTransactionAmount());
		}
	}
}
class BankAccount{
	private Integer accountNumber;
	private Integer dailyLimit;
	private Integer withdrawnAmount;
	public BankAccount(Integer accountNumber, Integer dailyLimit, Integer withdrawnAmount) {
		super();
		this.accountNumber = accountNumber;
		this.dailyLimit = dailyLimit;
		this.withdrawnAmount = withdrawnAmount;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Integer getDailyLimit() {
		return dailyLimit;
	}
	public void setDailyLimit(Integer dailyLimit) {
		this.dailyLimit = dailyLimit;
	}
	public Integer getWithdrawnAmount() {
		return withdrawnAmount;
	}
	public void setWithdrawnAmount(Integer withdrawnAmount) {
		this.withdrawnAmount = withdrawnAmount;
	}
}
class TransactionValidator{
	BankAccount b;
	Integer TransactionAmount;
	
	public TransactionValidator(BankAccount b,Integer TransactionAmount) {
		this.b = b;
		this.TransactionAmount=TransactionAmount;
	}

	public BankAccount getB() {
		return b;
	}

	public void setB(BankAccount b) {
		this.b = b;
	}

	public Integer getTransactionAmount() {
		return TransactionAmount;
	}

	public void setTransactionAmount(Integer transactionAmount) {
		TransactionAmount = transactionAmount;
	}

	public void isTransactionAllowed(BankAccount b, Integer transcationAmount) {
		if(transcationAmount!=null){
			int totalWithdrawl=b.getWithdrawnAmount()+transcationAmount;
			if(totalWithdrawl<=b.getDailyLimit()) {
				System.out.println("Account "+b.getAccountNumber()+" --> Transaction Approved");
			} else {
				System.out.println("Account "+b.getAccountNumber()+" --> Transaction Declined (Limit Exceeded)");
			}
		} else {
			System.out.println("Account "+b.getAccountNumber()+" --> Invalid Transaction Amount");
		}
	}
	
}