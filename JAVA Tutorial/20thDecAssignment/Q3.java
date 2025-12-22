import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the following:\n Is ID Card Available?\n Is The Employee Permanant or Contract?\nIs it approaved to work?");
        boolean idCard=sc.nextBoolean();
        sc.nextLine();
        String employeeStatus=sc.nextLine();
        boolean approve=sc.nextBoolean();
        String res=(idCard && (employeeStatus.equals("Permanant") || employeeStatus.equals("Contract")) && approve)?"Can Enter":"Can't Enter";
        System.out.println(res);
        sc.close();
    }
}
