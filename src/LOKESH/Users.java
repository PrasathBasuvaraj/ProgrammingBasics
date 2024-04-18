package LOKESH;

public class Users {
    public static void main(String[] args) {
        Entries new1 = new Entries("lokesh", 1, 24);
        Entries new2 = new Entries("karthick");
        System.out.println("user => " + new1.info());
        System.out.println("user => " + new2.info());
    }
}
