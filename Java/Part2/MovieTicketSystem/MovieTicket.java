package thread.MovieTicketSystem;

public class MovieTicket {

    public static void main(String[] args) {

        System.out.println("=== Movie Ticket Booking Started (Only 2 tickets left!) ===");

        TicketBookingSystem bookingSystem = new TicketBookingSystem();

        PersonA rahul = new PersonA(bookingSystem);
        PersonB priya = new PersonB(bookingSystem);

        rahul.start();
        priya.start();
    }
}
