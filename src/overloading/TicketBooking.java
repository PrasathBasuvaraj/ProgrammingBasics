package overloading;

public class TicketBooking {

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.bookTicket();
        bus.bookTicket("44A");
    }
}
