package TopBrainsCollections;

public class SmartWarehouseInventory {

}
enum ProductCategory{
    ELECTRONICS(18,0,0), GROCERY(5,10,50), CLOTHING(12,0,0);
	int taxRate;
	int discountRate;
	int discountLimit;
	private ProductCategory(int taxRate, int discountRate, int discountLimit) {
		this.taxRate = taxRate;
		this.discountRate = discountRate;
		this.discountLimit = discountLimit;
	}
	public double applyDiscount(double amount, int quantity) {
		if(quantity>discountLimit && discountRate>0) {
			return amount -(amount*discountRate/100.0);
		} return amount;
	}
	public double applyTax(double amount) {
		return amount+(amount*taxRate/100.0);
	}
	public boolean isDiscount(int quantity) {
		return quantity>discountLimit && discountRate>0;
	}
}
interface PriceCalculable{
    public int calculateFinalPrice(int quantity);
}
abstract class Product{
    String productId;
    int basePrice;
    ProductCategory productCategory;
    
    public Product(String productId, int basePrice, ProductCategory productCategory) {
		super();
		this.productId = productId;
		this.basePrice = basePrice;
		this.productCategory = productCategory;
	}

	public abstract void calculatePrice(int quantity);
}
class WarehouseProduct extends Product implements PriceCalculable{
	
	
	public WarehouseProduct(String productId, int basePrice, ProductCategory productCategory) {
		super(productId, basePrice, productCategory);
	}

	@Override
	public int calculateFinalPrice(int quantity) {
		double total=quantity*basePrice;
		total=productCategory.applyDiscount(total, quantity);
		total=productCategory.applyTax(total);
		return (int) total;
	}

	@Override
	public void calculatePrice(int quantity) {
		int finalPrice=calculateFinalPrice(quantity);
		if(productCategory.isDiscount(quantity)) {
            System.out.println("Final price for " + productId + " after discount: " + finalPrice);
		} else {
            System.out.println("Final price for " + productId + ": " + finalPrice);
		}
	}
    
}