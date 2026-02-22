package com.capg.client;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.beans.Address;
import com.capg.services.CustomerService;
import com.capg.services.LeadService;
import com.capg.services.OrderService;
import com.capg.services.ProductService;
import com.capg.services.ReportService;
import com.capg.services.SalesEmployeeService;
import com.capg.services.TicketService;

public class ApplicationClient {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("JPA-PU");

        CustomerService customerService = new CustomerService(emf);
        LeadService leadService = new LeadService(emf);
        ProductService productService = new ProductService(emf);
        OrderService orderService = new OrderService(emf);
        TicketService ticketService = new TicketService(emf);
        ReportService reportService = new ReportService(emf);
        SalesEmployeeService employeeService=new SalesEmployeeService(emf);

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== CRM MENU =====");
            System.out.println("1. Register Customer");
            System.out.println("2. Add Address to Customer");
            System.out.println("3. Create Lead");
            System.out.println("4. Assign Lead to Employee");
            System.out.println("5. Convert Lead to Customer");
            System.out.println("6. Add Product");
            System.out.println("7. Place Order");
            System.out.println("8. Raise Support Ticket");
            System.out.println("9. View Employee Performance");
            System.out.println("10. Add Sales Employees");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    customerService.registerCustomer(name, email, phone);
                    break;

                case 2:
                    System.out.print("Customer ID: ");
                    int custId = sc.nextInt();
                    sc.nextLine();

                    Address address = new Address();
                    System.out.print("Street: ");
                    address.setStreet(sc.nextLine());
                    System.out.print("City: ");
                    address.setCity(sc.nextLine());
                    System.out.print("State: ");
                    address.setState(sc.nextLine());
                    System.out.print("Zip: ");
                    address.setZipCode(sc.nextInt());

                    customerService.addAddressToCustomer(custId, address);
                    break;

                case 3:
                    System.out.print("Lead Name: ");
                    String leadName = sc.nextLine();
                    System.out.print("Source: ");
                    String source = sc.nextLine();
                    System.out.print("Contact Info: ");
                    String contact = sc.nextLine();

                    leadService.createLead(leadName, source, contact);
                    break;

                case 4:
                    System.out.print("Lead ID: ");
                    int leadId = sc.nextInt();
                    System.out.print("Employee ID: ");
                    int empId = sc.nextInt();

                    leadService.assignLeadToEmployee(leadId, empId);
                    break;

                case 5:
                    System.out.print("Lead ID to Convert: ");
                    int convertId = sc.nextInt();

                    leadService.convertLeadToCustomer(convertId);
                    break;

                case 6:
                    System.out.print("Product Name: ");
                    String prodName = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    productService.addProduct(prodName, price);
                    break;

                case 7:
                    System.out.print("Customer ID: ");
                    int orderCustId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product IDs (comma separated): ");
                    String input = sc.nextLine();
                    List<Integer> productIds = Arrays.stream(input.split(","))
                            .map(String::trim)
                            .map(Integer::parseInt)
                            .toList();

                    orderService.placeOrder(orderCustId, productIds);
                    break;

                case 8:
                    System.out.print("Order ID: ");
                    int orderId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Issue Description: ");
                    String issue = sc.nextLine();

                    ticketService.raiseTicket(orderId, issue);
                    break;

                case 9:
                    System.out.print("Employee ID: ");
                    int empPerformanceId = sc.nextInt();

                    Long performance =
                            reportService.getEmployeePerformance(empPerformanceId);

                    System.out.println("Total Leads Assigned: " + performance);
                    break;
                case 10:
                    System.out.print("Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Address ID: ");
                    int addrId = sc.nextInt();

                    employeeService.addEmployee(dept, addrId);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        emf.close();
        sc.close();
    }
}