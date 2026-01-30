package topbrainsthreads;

import java.util.LinkedList;
import java.util.Queue;

public class InventoryManagementSystem {

	public static void main(String[] args) {
		Inventory inventory = new Inventory(1);

        Thread producer = new Thread(new Producer(inventory));
        Thread consumer = new Thread(new Consumer(inventory));

        producer.start();
        consumer.start();
	}

}
class Inventory{
	Queue<String> items=new LinkedList<String>();
	int capacity;
	public Inventory(int capactiy) {
		super();
		this.capacity = capactiy;
	}
	public synchronized void produce(String item) {
		try {
			while(items.size()==capacity) {
				wait();
			}
			items.add(item);
			System.out.println("Produced: "+item);
			notify();
		} catch(Exception e) {
			System.err.print(e.getMessage());
		}
	}
	public synchronized void consume() {
		try {
			while(items.isEmpty()) {
				wait();
			}
			String item=items.poll();
			System.out.println("Consumed: "+item);
			notify();
;		}catch (InterruptedException e) {
    		Thread.currentThread().interrupt();
}
	}
}

class Producer implements Runnable{
	Inventory inventory;

	public Producer(Inventory inventory) {
		super();
		this.inventory = inventory;
	}
	@Override
	public void run() {
		String[] products = {"Laptop", "Mouse", "Keyboard", "Monitor"};
        for (String product : products) {
            inventory.produce(product);
        }
	}
}

class Consumer implements Runnable{
	Inventory inventory;

	public Consumer(Inventory inventory) {
		super();
		this.inventory = inventory;
	}
	@Override
	public void run() {
		 for (int i = 0; i < 4; i++) {
	            inventory.consume();
	        }
	}
}