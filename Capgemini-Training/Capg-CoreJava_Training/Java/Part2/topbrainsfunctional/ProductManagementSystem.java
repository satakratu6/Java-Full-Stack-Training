package topbrainsfunctional;

import java.util.ArrayList;

public class ProductManagementSystem {

	public static void main(String[] args) {
		ArrayList<Product> list=new ArrayList<>();
		Product product[] = {
				new Product("Milk",800,"Dairy"),
				new Product("Butter",1200,"Dairy"),
				new Product("Tomato", 1600, "Groceries"),
				new Product("Onion",800, "Groceries"),
				new Product("Paneer",2000,"Dairy")
		};
		for(Product p:product){
			list.add(p);
		}
		list.stream()
	    .forEach(p -> {
	        p.name = p.name.toUpperCase();
	        System.out.println(p.name + " " + p.price + " " + p.category);
	    });
	}

}


class Product{
	String name;
	double price;
	String category;
	public Product(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getCategory() {
		return category;
	}
	@Override
	public String toString() {
		return name + price +  category ;
	}
	
}