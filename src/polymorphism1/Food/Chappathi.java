package polymorphism1.Food;

public class Chappathi extends Food {

    void chapathiFamily() {
        System.out.println("we are from chappathi family and select the items u need");

        String[] Varieties = {"rotti", "naan", "chapathi"};
        for (int i = 0; i < Varieties.length; i++) {
            System.out.println(Varieties[i]);
        }
        System.out.println("Total items" + " " + Varieties.length);

    }
}
