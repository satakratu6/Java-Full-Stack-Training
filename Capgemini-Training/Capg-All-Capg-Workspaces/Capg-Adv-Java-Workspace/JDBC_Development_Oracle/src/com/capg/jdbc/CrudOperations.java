package com.capg.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CrudOperations {

    

    public static void main(String[] args) throws Exception {
    	String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
         String userName = "scott";
       String password = "satakratu789";
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, userName, password);
        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== CRUD MENU =====");
            System.out.println("1. Insert");
            System.out.println("2. View");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    String insertQuery = "insert into Employeeinfo2 values(?,?,?)";
                    PreparedStatement insertStmt = conn.prepareStatement(insertQuery);

                    System.out.print("Enter empno: ");
                    int empno = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    insertStmt.setInt(1, empno);
                    insertStmt.setString(2, name);
                    insertStmt.setDouble(3, salary);

                    int i = insertStmt.executeUpdate();
                    System.out.println(i + " record inserted.");
                    break;

                case 2:
                    String viewQuery = "select * from Employeeinfo2";
                    PreparedStatement viewStmt = conn.prepareStatement(viewQuery);
                    ResultSet rs = viewStmt.executeQuery();

                    System.out.println("\n---- Employee Records ----");

                    while (rs.next()) {
                        System.out.println(
                                rs.getInt(1) + " | " +
                                rs.getString(2) + " | " +
                                rs.getDouble(3));
                    }
                    break;

                case 3:
                    String updateQuery = "update Employeeinfo2 set ename=?, sal=? where empno=?";
                    PreparedStatement updateStmt = conn.prepareStatement(updateQuery);

                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new salary: ");
                    double newSalary = sc.nextDouble();

                    updateStmt.setString(1, newName);
                    updateStmt.setDouble(2, newSalary);
                    updateStmt.setInt(3, uid);

                    int u = updateStmt.executeUpdate();
                    System.out.println(u + " record updated.");
                    break;

                case 4:
                    String deleteQuery = "delete from Employeeinfo2 where empno=?";
                    PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery);

                    System.out.print("Enter empno to delete: ");
                    int did = sc.nextInt();

                    deleteStmt.setInt(1, did);

                    int d = deleteStmt.executeUpdate();
                    System.out.println(d + " record deleted.");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        conn.close();
        sc.close();
    }
}
