package thread.MovieTicketSystem;

public class TicketBookingSystem {

    private final Object seatLock = new Object();
    private final Object paymentLock = new Object();

    public void bookByChoosingSeatFirst(String person) {
        synchronized (seatLock) {
            System.out.println(person + " -> Got seatLock, choosing seats...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            System.out.println(person + " -> Now waiting for paymentLock...");

            synchronized (paymentLock) {
                System.out.println(person + " -> Got paymentLock -> Booking confirmed!");
            }
        }
    }

    public void bookByPayingFirst(String person) {
        synchronized (paymentLock) {
            System.out.println(person + " -> Got paymentLock, entering card details...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            System.out.println(person + " -> Now waiting for seatLock...");

            synchronized (seatLock) {
                System.out.println(person + " -> Got seatLock -> Booking confirmed!");
            }
        }
    }
}