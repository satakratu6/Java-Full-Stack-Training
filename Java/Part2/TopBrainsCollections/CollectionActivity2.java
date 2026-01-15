package TopBrainsCollections;
import java.util.ArrayList;

public class CollectionActivity2 {
	
	    public static void main(String[] args){
//	        Product p1=new Product(1," Milk");
//	        Product p2=new Product(2," Tea");
//	        Product p3=new Product(3," Biscuit");
//	        Product p4=new Product(4," Coffee");
//	        Product p5=new Product(5," Chocolate");
//
//	        ShoppingCart s=new ShoppingCart();
//	        s.addProduct(p1);
//	        s.addProduct(p2);
//	        s.addProduct(p3);
//	        s.addProduct(p4);
//	        s.addProduct(p5);
//	        s.displayCart();
//	        s.removeProduct(p1);
//	        s.displayCart();
//	        Product p6=new Product(3, "Honey");
//	        s.removeProduct(p6);
//	        s.displayCart();
	    	int ids[]= {1,2,3,4,5};
	    	String products[]= {" Milk", " Tea", " Biscuit", " Coffee", " Chocolate"};
	    	ShoppingCart s=new ShoppingCart();
	    	for(int i=0;i<ids.length;i++) {
	    		s.addProduct(new Product(ids[i],products[i]));
	    	}
	    	s.displayCart();
	    	s.removeProduct(new Product(1," Milk"));
	    	s.displayCart();
	    	s.removeProduct(new Product(3,"Honey"));
	    	s.displayCart();

	    }
	}
	class Product {
	    private int productID;
	    private String product;
	    Product(int productID, String product){
	        this.productID=productID;
	        this.product=product;
	    }
	    
	    @Override
	    public String toString(){
	        return productID +product;
	    }
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (!(obj instanceof Product)) return false;
	        Product p = (Product) obj;
	        return this.productID == p.productID &&
	               this.product.equals(p.product);
	    }
	}
	class ShoppingCart {
	    private ArrayList<Product> items=new ArrayList<Product>();
	    public void addProduct(Product p){
	        if(items!=null){
	            items.add(p);
	        } else{
	            System.out.println("Kindly initialse the arraylist first");
	        }
	    }
	    public void displayCart(){
	        System.out.println(items);
	    } 
	    public void removeProduct(Product p){
	       
	       
	            if(items.contains(p)){
	                items.remove(p);
	                System.out.println("Item removed successfully");
	            } else{
	            System.out.println("Item not removed from the cart");

	            }
	    }

	}

