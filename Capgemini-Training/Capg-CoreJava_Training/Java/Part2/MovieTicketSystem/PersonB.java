package thread.MovieTicketSystem;

public class PersonB extends Thread {

    private final TicketBookingSystem system;

    PersonB(TicketBookingSystem system) {
        this.system = system;
    }

    @Override
    public void run() {
        system.bookByPayingFirst("Priya (Payment First)");
    }
}