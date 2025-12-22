import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Is Driver available");
        boolean isDriverAvailable=sc.nextBoolean();
        sc.nextLine();
        System.out.println("Write the user location: ");
        String userLocation=sc.nextLine();
        System.out.println("Is the User location Serviceable");
        boolean isUserLocationServiceable=sc.nextBoolean();
        sc.nextLine();
        if(isDriverAvailable && isUserLocationServiceable){
            System.out.println("What's the Driver's name: ");
            String driverName=sc.nextLine();
            System.out.println("Whats the payment.mode");
            String paymentMode=sc.nextLine();
            System.out.println("Booking is confirmed, the booking details are as follows: ");
            System.out.println("Driver Name: "+driverName);
            System.out.println("User location: "+userLocation);
            System.out.println("Payment mode: "+paymentMode);
        } else{
            System.out.println("No driver is available");
        }
        sc.close();
    }
}
