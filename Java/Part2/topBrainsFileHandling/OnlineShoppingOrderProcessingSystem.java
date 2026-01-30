package topBrainsFileHandling;

import java.io.*;
import java.util.*;

public class OnlineShoppingOrderProcessingSystem {

    public static void main(String[] args) {
        Order o1 = new Order("ORD101", 201, "Laptop", 1, 65000);
        Order o2 = new Order("ORD102", 202, "Mouse", 2, 1200);
        Order o3 = new Order("ORD103", 203, "Keyboard", 1, 2500);

        OrderFileHandler file = new OrderFileHandler("sample.dat");

        file.saveOrder(o1);
        file.saveOrder(o2);
        file.saveOrder(o3);

        System.out.println("\nAll Orders:");
        file.readAllOrders();

        System.out.println("\nOrders of Customer 202:");
        file.getOrdersByCustomerId(202);

        System.out.println("\nHigh Value Orders (>3000):");
        file.getHighValueOrders(3000);
    }
}
class AppendableObjectOutputStream extends ObjectOutputStream {
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset(); // avoids corrupting stream
    }
}
class Order implements Serializable {
    String orderId;
    int customerId;
    String productName;
    int quantity;
    double totalPrice;

    public Order(String orderId, int customerId, String productName, int quantity, double totalPrice) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productName = productName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return orderId + "," + customerId + "," + productName + "," + quantity + "," + (int) totalPrice;
    }
}
class OrderFileHandler {
    private final String filePath;

    public OrderFileHandler(String filePath) {
        this.filePath = filePath;
    }

    public void saveOrder(Order order) {
        File file = new File(filePath);
        boolean append = file.exists() && file.length() > 0;

        try (ObjectOutputStream oos = append
                ? new AppendableObjectOutputStream(new FileOutputStream(file, true))
                : new ObjectOutputStream(new FileOutputStream(file))) {

            oos.writeObject(order);

        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
        }
    }

    public void readAllOrders() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            while (true) {
                Order order = (Order) ois.readObject();
                System.out.println(order);
            }
        } catch (EOFException e) {
            // End of file – normal behavior
        } catch (Exception e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }

    public void getOrdersByCustomerId(int id) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            while (true) {
                Order order = (Order) ois.readObject();
                if (order.customerId == id) {
                    System.out.println(order);
                }
            }
        } catch (EOFException e) {
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void getHighValueOrders(double minAmount) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            while (true) {
                Order order = (Order) ois.readObject();
                if (order.totalPrice > minAmount) {
                    System.out.println(order);
                }
            }
        } catch (EOFException e) {
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
