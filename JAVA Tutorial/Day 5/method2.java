import java.util.*;
public class method2 {

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter your choices:\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\5-exit");
        // int choice=sc.nextInt();
        // switch(choice){
        //     case 1:
        //         add();
        //         break;
        //     case 2:
        //         subtract();
        //         break;
        //     case 3:
        //         mutlplication();
        //         break;
        //     case 4:
        //         division();
        //         break;
        //     case 5:
        //         System.out.println("Exiting");
        //         System.exit(0);
        //     default:
        //         System.out.println("Wrong choice!!!");
        // }
        add();
        subtract();
        division();
        mutlplication();
        //Exception
        
    }
    public static void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the first number: ");
        int a=sc.nextInt();
        System.out.println("Write the second number: ");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(c);
        sc.close();
    }
    public static void subtract(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the first number: ");
        int a=sc.nextInt();
        System.out.println("Write the second number: ");
        int b=sc.nextInt();
        int c=a-b;
        System.out.println(c);
        sc.close();
    }public static void mutlplication(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the first number: ");
        int a=sc.nextInt();
        System.out.println("Write the second number: ");
        int b=sc.nextInt();
        int c=a*b;
        System.out.println(c);
        sc.close();
    }public static void division(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the first number: ");
        int a=sc.nextInt();
        System.out.println("Write the second number: ");
        int b=sc.nextInt();
        int c=a/b;
        System.out.println(c);
        sc.close();
    }
}
