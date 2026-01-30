package TopBrainsCollections;

public class MultiTierSubscriptionBillingSystem {
	public static void main(String[] args) {
		CustomerSubscription c1=new CustomerSubscription(SubscriptionPlan.BASIC, 8, "C101", BillingCycle.MONTHLY);
		CustomerSubscription c2=new CustomerSubscription(SubscriptionPlan.PREMIUM, 15, "C102", BillingCycle.YEARLY);
		CustomerSubscription c3=new CustomerSubscription(SubscriptionPlan.FREE, 5, "C103", BillingCycle.MONTHLY);
		c1.generateInvoice();
		c2.generateInvoice();
		c3.generateInvoice();
	}

}
enum SubscriptionPlan{
	FREE(0,3),BASIC(499,10),PREMIUM(999,20),ENTERPRISE(1499,Integer.MAX_VALUE);
	private int monthlyPrice;
	private int maximumUser;
	private SubscriptionPlan(int monthlyPrice, int maximumUser) {
		this.monthlyPrice = monthlyPrice;
		this.maximumUser = maximumUser;
	}
	public int calculateFinalPrice(int user, BillingCycle cycle) {
		int basePrice=monthlyPrice*user;
		if(cycle==BillingCycle.YEARLY) {
			basePrice=basePrice*12;
			basePrice-=basePrice*15/100;
		}
		return basePrice;
	}
	public boolean isValidateUser(int user) {
		return user<=maximumUser;
	}
}
enum BillingCycle{
	MONTHLY, YEARLY;
}

interface Billable {
	public int calculateBill(int users, BillingCycle billingCycle);
}
abstract class Subscription{
	SubscriptionPlan planType;
	int users;
	public Subscription(SubscriptionPlan planType, int users) {
		this.planType = planType;
		this.users = users;
	}
	public boolean validateUsage() {
		return planType.isValidateUser(users);
	}
	public abstract void generateInvoice();
}
class CustomerSubscription extends Subscription implements Billable{
	 private String customerId;
	 private BillingCycle billingCycle;

	

	public CustomerSubscription(SubscriptionPlan planType, int users, String customerId, BillingCycle billingCycle) {
		super(planType, users);
		this.customerId = customerId;
		this.billingCycle = billingCycle;
	}

	@Override
	public int calculateBill(int users, BillingCycle billingCycle) {
		return planType.calculateFinalPrice(users, billingCycle);
	}

	@Override
	public void generateInvoice() {
		if(validateUsage()) {
			int amount=calculateBill(users, billingCycle);
			if(billingCycle==billingCycle.YEARLY) {
				System.out.println("Invoice generated for "+customerId+" after 15% discount: "+amount);
			} else {
				System.out.println("Invoice generated for "+customerId+": "+amount);
			}
		}else {
			System.out.println("User limit exceeded for "+planType+" plan");
		}
	}
	
}