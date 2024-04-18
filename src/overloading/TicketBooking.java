package overloading;

public class TicketBooking {

    public static void main(String[] args) {
        CityBus citybus = new CityBus();
        citybus.bookTicket();
        citybus.bookTicket("43W");
    }
}
