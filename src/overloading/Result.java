package overloading;

public class Result {
    public static void main(String[] args) {
        Citybus bus = new Citybus();
        bus.bookticket();
        bus.bookticket("44A");
    }
}
