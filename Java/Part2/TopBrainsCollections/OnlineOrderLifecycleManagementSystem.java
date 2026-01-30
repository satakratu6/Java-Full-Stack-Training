package TopBrainsCollections;

public class OnlineOrderLifecycleManagementSystem {
public static void main(String[] args) {
	Order o1=new Order(101, "Alice",OrderStatus.PLACED);
	Order o2=new Order(102, "Bob",OrderStatus.PAID);
	Order o3=new Order(103, "Charlie",OrderStatus.SHIPPED);
	OrderProcessingService process=new OrderProcessingService();
	process.processStatusChange(o1, OrderStatus.PAID);
	process.processStatusChange(o2, OrderStatus.SHIPPED);
	process.processStatusChange(o3, OrderStatus.PAID);
}
}
enum OrderStatus{
	PLACED{
		public boolean moveTo(OrderStatus next) {
			return next==PAID || next==CANCELLED;
		}
	},
	PAID{
		public boolean moveTo(OrderStatus next) {
			return next==SHIPPED || next==CANCELLED;
		}
	},
	SHIPPED{
		public boolean moveTo(OrderStatus next){
			return next==DELIVERED;
		}
	},
	DELIVERED{
		public boolean moveTo(OrderStatus next){
			return false;
		}
	},
	CANCELLED{
		public boolean moveTo(OrderStatus next){
			return false;
		}
		
	};
	public abstract boolean moveTo(OrderStatus next);
}
class Order{
	private int orderId;
	private String customerName;
	OrderStatus currentStatus;
	public Order(int orderId, String customerName, OrderStatus currentStatus) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.currentStatus = currentStatus;
	}
	public int getOrderId() {
		return orderId;
	}
	public OrderStatus getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(OrderStatus currentStatus) {
		this.currentStatus=currentStatus;
	}
	public void updateStatus() {
		
	}
	public void displayOrderDetails() {
	}
}
class  OrderProcessingService{
	public boolean validateTransition(OrderStatus oldStatus, OrderStatus newStatus) {
		return oldStatus.moveTo(newStatus);
	}
	public void processStatusChange (Order order, OrderStatus newStatus) {
		OrderStatus oldStatus=order.getCurrentStatus();
		if(validateTransition(oldStatus, newStatus)) {
			System.out.println("Order "+order.getOrderId()+" status updated from "+oldStatus+" to "+newStatus);

		} else {
			System.out.println("Order "+order.getOrderId()+" cannot move from "+oldStatus+" to "+newStatus);
		}
	}
}
