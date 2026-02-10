package EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeManagementSystem {
	private Employee[] employees=new Employee[20];
	private int count=0;
	private Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new EmployeeManagementSystem().start();
	}
	public void start() {
		while(true) {
			System.out.println("Enter your choices:\n"
					+ "1. Add Employee"
					+ "2. Display Employees"
					+ "3. Update Employee"
					+ "4. Delete Employee"
					+ "5. Search Employee"
					+ "6. Count By Department"
					+ "7. Exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				add();
				break;
			case 2:
				display();
				break;
			case 3:
				update();
				break;
			case 4:
				delete();
				break;
			case 5:
				search();
				break;
			case 6:
				countByDepartment();
				break;
			case 7:
				System.exit(0);
				break;
			case 8:
				System.out.println("Wrong Choice Buddy!!");
			}
		}
	}
	public void add() {
		System.out.println("Enter Employee Id: ");
		int id=sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < count; i++) {
	           if (employees[i].equals(new Employee(id, "", "", 0))) {
	               System.out.println("Employee already exists!");
	               return;
	            }
	        }	
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter Department: ");
		String department=sc.nextLine();
		System.out.println();
		System.out.println("Enter Salary: ");
		double salary=sc.nextDouble();
		
		employees[count++]=new Employee(id,name,department,salary);
		System.out.println("Employee added succesfully");
	}
	public void display() {
		for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + employees[i]);
        }
	}
	public void update() {
		System.out.println("Enter Employee Id: ");
		int id=sc.nextInt();
		sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                System.out.print("New Name: ");
                employees[i].setName(sc.nextLine());

                System.out.print("New Department: ");
                employees[i].setDepartment(sc.nextLine());

                System.out.print("New Salary: ");
                employees[i].setSalary(sc.nextDouble());

                System.out.println("Updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
	}
	public void delete() {
		 System.out.print("Enter ID: ");
	      int id = sc.nextInt();

	      for (int i = 0; i < count; i++) {
	    	  if (employees[i].getId() == id) {
	    		  for (int j = i; j < count - 1; j++) {
	                    employees[j] = employees[j + 1];
	                }
	                employees[--count] = null;
	                System.out.println("Deleted successfully.");
	                return;
	            }
	        }
	        System.out.println("Employee not found.");
	}
	public void search() {
		System.out.println("Enter Employee ID to search: ");
		int id=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<count;i++) {
			if(employees[i].equals(new Employee(id, "", "", 0))){
				System.out.println("Employee Fouund");
	            System.out.println((i + 1) + ". " + employees[i]);
			} else {
				System.out.println("Employee doesn't exist");
			}
		}
		
	}
	public void countByDepartment() {
        sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        int total = 0;
        for (int i = 0; i < count; i++) {
            if (employees[i].getDepartment().equalsIgnoreCase(dept)) {
                total++;
            }
        }
        System.out.println("Employees in " + dept + ": " + total);
    }
}
