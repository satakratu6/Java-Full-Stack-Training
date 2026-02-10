package TopBrainsCollections;

public class OnlineShoppingCart {
public static void main(String[] args) {
	DiscountService[] carts = {
            new DiscountService("C1", 4, 2500.0),
            new DiscountService("C2", 2, 1800.0),
            new DiscountService("C3", null, 3000.0)
        };
	for(DiscountService cart : carts) {
		if (cart.validateCartData()) {

            if (cart.isDiscountApplicable()) {
                System.out.println("Cart " + cart.getCartId()
                        + " --> Discount Applied --> Final Amount: "
                        + cart.calculateDiscount());
            } else {
                System.out.println("Cart " + cart.getCartId()
                        + " --> No Discount");
            }

        } else {
            System.out.println("Cart " + cart.getCartId()
                    + " --> Invalid Cart Data");
        }
    }
	}
}

class Cart{
	private String cartId;
	private Integer itemCount;
	private Double totalAmount;
	
	public Cart(String cartId, Integer itemCount, Double totalAmount) {
		super();
		this.cartId = cartId;
		this.itemCount = itemCount;
		this.totalAmount = totalAmount;
	}

	public String getCartId() {
		return cartId;
	}
	
	public Integer getItemCount() {
		return itemCount;
	}
	
	public Double getTotalAmount() {
		return totalAmount;
	}
	
	
	
}
class DiscountService extends Cart{

	
	public DiscountService(String cartId, Integer itemCount, Double totalAmount) {
		super(cartId, itemCount, totalAmount);
	}
	public boolean validateCartData() {
		if(getItemCount()!=null && getTotalAmount()!=null) {
			return true;
		} else {
			return false;
		}
	}
	public boolean isDiscountApplicable() {
		if(getItemCount()>=3 && getTotalAmount()>=2000) {
			return true;
		} else {
			return false;
		}
	}
	public double calculateDiscount() {
		return getTotalAmount() -getTotalAmount()*0.1;
	}
	
}