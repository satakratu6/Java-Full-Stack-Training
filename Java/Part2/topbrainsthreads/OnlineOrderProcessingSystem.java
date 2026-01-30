package topbrainsthreads;

public class OnlineOrderProcessingSystem {

	public static void main(String[] args) throws InterruptedException {
		Order o1=new Order(101, "Alice",2500);
		Order o2=new Order(102, "Bob",1500);
		Order o3=new Order(103, "Charlie",3200);
		Thread t1=new Thread(new OrderProcessor(o1));
		Thread t2=new Thread(new OrderProcessor(o2));
		Thread t3=new Thread(new OrderProcessor(o3));
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		

	}

}
class Order{
	int orderId;
	String customerName;
	double amount;
	public Order(int orderId, String customerName, double amount) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.amount = amount;
	}
	
}

class OrderProcessor implements Runnable{
	Order order;
	OrderProcessor(Order order){
		this.order=order;
	}
	@Override
	public void run() {
		validateOrder();
		processPayment();
		shipOrder();
	}
	synchronized void validateOrder() {
		System.out.println("Validating order "+order.orderId);
	}
	synchronized void processPayment() {
		System.out.println("Processing payment for order "+order.orderId);
	}
	synchronized void shipOrder() {
		System.out.println("Shipping order "+order.orderId);
	}
}
