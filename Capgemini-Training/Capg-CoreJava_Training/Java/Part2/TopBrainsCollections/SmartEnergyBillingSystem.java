package TopBrainsCollections;

public class SmartEnergyBillingSystem {
	public static void main(String[] args) {
		Customer customers[]={
			new Customer(1, "Ramesh", new MeterReading(1200, 1350)),
			new Customer(2, "Sita", new MeterReading(null, 1400)),
			new Customer(3, "Mohan", new MeterReading(900, null)),
		};
		for(Customer c:customers) {
			new BillingService().generateBill(c);;
		}
	}
}
class MeterReading{
	private Integer previousReading;
	private Integer currentReading;
	public MeterReading(Integer previousReading, Integer currentReading) {
		super();
		this.previousReading = previousReading;
		this.currentReading = currentReading;
	}
	public Integer getPreviousReading() {
		return previousReading;
	}
	public void setPreviousReading(Integer previousReading) {
		this.previousReading = previousReading;
	}
	public Integer getCurrentReading() {
		return currentReading;
	}
	public void setCurrentReading(Integer currentReading) {
		this.currentReading = currentReading;
	}
	
}
class Customer{
	private Integer customerId;
	private String customerName;
	MeterReading m;
	public Customer(Integer customerId, String customerName, MeterReading m) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.m = m;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public MeterReading getM() {
		return m;
	}
	public void setM(MeterReading m) {
		this.m = m;
	}
	
}
class  BillingService{
	public Integer calculateUnits(MeterReading m) {
		if(m.getCurrentReading()!=null && m.getPreviousReading()!=null) {
			return m.getCurrentReading()-m.getPreviousReading();
		} else {
			return null;
		}
	}
	public Integer calculateBill(MeterReading m) {
		return calculateUnits(m)*5;
	}
	public void generateBill(Customer c) {
		if(calculateUnits(c.getM())!=null) {
			System.out.println(c.getCustomerName()+" --> Units: "+calculateUnits(c.getM())+" --> Bill: "+calculateBill(c.getM()));
		} else {
			System.out.println(c.getCustomerName()+" --> Invalid Meter Data");
		}
	}
}
