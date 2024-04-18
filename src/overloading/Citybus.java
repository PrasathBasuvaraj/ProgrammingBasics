package overloading;

public class Citybus {

    void bookticket() {
        System.out.println("Random ticket is booked");
    }

    void bookticket(String ticket_number) {
        System.out.println("ticket booked");
    }
}
