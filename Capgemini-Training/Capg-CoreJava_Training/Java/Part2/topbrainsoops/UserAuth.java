package topbrainsoops;

public class UserAuth {

	public static void main(String[] args) {
		Customer c=new Customer("C101","Rahul","rahul@example.com");
		c.login();
		
		c.sendNotification();
		
		c.addToCart("Laptop");
		c.addToCart("Mouse");
		c.addToCart("Keyboard");
		System.out.println();

		System.out.println("Totel Items in Cart: "+c.getItemCount());
	}

}


abstract class User{
	String userId;
	String userName;
	public User(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public abstract void login();
}

interface Notification{
	public void sendNotification();
}

class Customer extends User implements Notification{
	String email;
	String[] cartItems = new String[10];
	int itemCount=0;
	public Customer(String userId, String userName, String email) {
		super(userId, userName);
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getItemCount() {
		return itemCount;
	}
	public void addToCart(String items) {
		cartItems[itemCount++]=items;
		System.out.println("Item added to cart: "+items);
	}
	@Override
	public void sendNotification() {
		 System.out.println("Notification sent to " + getUserName() + " (Email: " + email + ")");
	     System.out.println();
	}
	@Override
	public void login() {
		System.out.println("Customer Login Successful.");
		System.out.println("User ID: "+userId);
		System.out.println("User Name: "+userName);	
	    System.out.println();

	}
	
}