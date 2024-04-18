package overloading;

public class Result {
    public static void main(String[] args) {
        CityBus bus = new CityBus();
        bus.bookTicket();
        bus.bookTicket("44A");
    }
}
