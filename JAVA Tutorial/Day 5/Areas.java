import java.util.Scanner;

public class Areas {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice=0;
        String pref="yes";

        while (pref.equals("yes")) {
            System.out.println(
                "Enter your choices:\n" +
                "1 - Rectangle\n" +
                "2 - Square\n" +
                "3 - Circle\n"
            );

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The area of Rectangle: " + rectangle());
                    break;
                case 2:
                    System.out.println("The area of Square: " + square());
                    break;
                case 3:
                    System.out.println("The area of Circle: " + circle());
                    break;
                default:
                    System.out.println("Wrong choice!!!!");
            }
            System.out.println("Do you want to continue? yes or no: ");
            pref=sc.next();


        } 
        
        // while(choice!=4) {
        //     System.out.println(
        //         "Enter your choices:\n" +
        //         "1 - Rectangle\n" +
        //         "2 - Square\n" +
        //         "3 - Circle\n" +
        //         "4 - Exit"
        //     );

        //     choice = sc.nextInt();

        //     switch (choice) {
        //         case 1:
        //             System.out.println("The area of Rectangle: " + rectangle());
        //             break;
        //         case 2:
        //             System.out.println("The area of Square: " + square());
        //             break;
        //         case 3:
        //             System.out.println("The area of Circle: " + circle());
        //             break;
        //         case 4:
        //             System.out.println("Exiting!");
        //             break;
        //         default:
        //             System.out.println("Wrong choice!!!!");
        //     }

        // } 
    }

    public static int rectangle() {
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();
        return l * b;
    }

    public static int square() {
        System.out.println("Enter the side:");
        int s = sc.nextInt();
        return s * s;
    }

    public static double circle() {
        System.out.println("Enter the radius:");
        int r = sc.nextInt();
        return 3.14 * r * r;
    }
}
