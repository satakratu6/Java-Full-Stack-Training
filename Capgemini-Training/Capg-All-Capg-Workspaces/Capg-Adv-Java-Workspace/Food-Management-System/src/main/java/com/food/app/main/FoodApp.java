package com.food.app.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.food.service.CategoryService;
import com.food.service.FoodItemService;
import com.food.service.OrderService;

public class FoodApp {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring.xml");

        CategoryService categoryService = ctx.getBean(CategoryService.class);
        FoodItemService foodService = ctx.getBean(FoodItemService.class);
        OrderService orderService = ctx.getBean(OrderService.class);

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1.Add Category");
            System.out.println("2.Add Food Item");
            System.out.println("3.View Items By Category");
            System.out.println("4.Place Order");
            System.out.println("5.Calculate Total Bill");
            System.out.println("6.Delete Food Item");
            System.out.println("7.Exit");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Category Name: ");
                    sc.nextLine();                   
                    String cname = sc.nextLine();

                    System.out.print("Description: ");
                    String desc = sc.nextLine();

                    categoryService.addCategory(cname, desc);
                    System.out.println("Category Added");
                    break;

                case 2:
                    System.out.print("Category ID: ");
                    long cid = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Food Name: ");
                    String fname = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    foodService.addFoodItem(cid, fname, price);
                    System.out.println("Food Item Added");
                    break;

                case 3:
                    System.out.print("Category ID: ");
                    long catId = sc.nextLong();

                    foodService.getItemsByCategory(catId)
                            .forEach(f ->
                                    System.out.println(
                                            f.getFood_id() + " " +
                                            f.getItemName() + " " +
                                            f.getPrice()
                                    ));
                    break;

                case 4:
                	sc.nextLine();
                	
                    System.out.print("Customer Name: ");
                    String customer = sc.nextLine();

                    System.out.print("How many items? ");
                    int count = sc.nextInt();

                    List<Integer> ids = new ArrayList<>();
                    for (int i = 0; i < count; i++) {
                        System.out.print("Food Item ID: ");
                        ids.add(sc.nextInt());
                    }

                    orderService.placeOrder(ids, customer);
                    System.out.println("Order Placed");
                    break;

                case 5:
                    System.out.print("Order ID: ");
                    int orderId = sc.nextInt();

                    double total = orderService.calculateTotal(orderId);
                    System.out.println("Total Bill = " + total);
                    break;

                case 6:
                    System.out.print("Food Item ID: ");
                    int foodId = sc.nextInt();

                    foodService.removeFoodItem(foodId);
                    System.out.println("Food Item Deleted");
                    break;

                case 7:
                    System.exit(0);
            }
        }
    }
}