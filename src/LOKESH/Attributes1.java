package LOKESH;

public class Attributes1 {

    public static void main(String[] args) {
        Attributes myObj = new Attributes();
        Attributes.name = "blokish";
        myObj.number = 99;
        myObj.username = "loke";
        myObj.setFirstName("lokeee");
        System.out.println(myObj.lastName);
        System.out.println(Attributes.name);
        System.out.println(myObj.number);
        System.out.println(myObj.getFirstName());

    }
}
