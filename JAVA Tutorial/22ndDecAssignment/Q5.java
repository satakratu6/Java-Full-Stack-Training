import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Are seats available? (true/false)");
        boolean seatsAvailable = sc.nextBoolean();

        if (seatsAvailable) {
            System.out.println("Ticket Confirmed");
        } else {
            System.out.println("Is RAC available? (true/false)");
            boolean racAvailable = sc.nextBoolean();

            if (racAvailable) {
                System.out.println("Ticket Waitlisted");
            } else {
                System.out.println("Ticket Cancelled");
            }
        }

        sc.close();
    }
}
