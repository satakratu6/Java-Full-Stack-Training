import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the first number: ");
        int n1=sc.nextInt();
        System.out.println("Write the second number: ");
        int n2=sc.nextInt();
        System.out.println("Give your choice\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Addition of two numbers is: "+(n1+n2));
                break;
            case 2:
                System.out.println("subtraction of two numbers is: "+(n1-n2));
                break;
            case 3:
                System.out.println("Multiplication of two numbers is: "+(n1*n2));
                break;
            case 4:
                System.out.println("Division of two numbers is: "+(double)(n1/n2));
                break;
            default:
                System.out.println("Wrong choice!!!");
        }
        sc.close();
    }
}
