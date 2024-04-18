package polymorphism1.Food;

public class Dosa extends Food {

    public static void Dosa_family() {

        System.out.println("we are from dosa family and select the items u need");
        String[] Varieties = {"roast", "podiroast", "gheeroast"};
        for (int i = 0; i < Varieties.length; i++) {
            System.out.println((Varieties[i]));
        }
        System.out.println("Total items" + " " + Varieties.length);

    }
}


