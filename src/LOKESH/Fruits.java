package LOKESH;

public class Fruits {
    public static void main(String[] args) {
        System.out.println(fruitsList(80));
    }

    public static String fruitsList(int fruitsList) {
        int fruitsNumber = 80;
        if (fruitsList >= fruitsNumber) {
            return "Bag is full ";
        } else {
            return "bag is not full";
        }
    }
}
