package overloading;

public class CityBus {

    void bookTicket() {
        System.out.println("Random ticket is booked");
    }

    void bookTicket(String ticket_number) {
        System.out.println("Selected ticket booked : "+ ticket_number);
    }
}
