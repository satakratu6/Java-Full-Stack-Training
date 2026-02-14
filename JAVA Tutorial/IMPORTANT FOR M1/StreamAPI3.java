import java.util.*;

class Product{
    private String productName;
    private double price;

    Product(String productName, double price){
        this.productName = productName;
        this.price = price;
    }

    public String getProductName(){
        return productName;
    }

    public double getPrice(){
        return price;
    }

    public String toString(){
        return productName + " : " + price;
    }
}

class ProductImplementation{

    public String getProductName(List<Product> list){
        return list.stream()
                .filter(p -> p.getPrice() > 50000)
                .map(Product::getProductName)
                .findFirst()
                .orElse("No product found");
    }
}

public class StreamAPI3{

    public static void main(String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("Laptop", 50000));
        list.add(new Product("Computer", 30000));
        list.add(new Product("OPPO", 78000));

        ProductImplementation pm = new ProductImplementation();

        System.out.println(pm.getProductName(list));
    }
}
 
